public class Arvore {
    private No raiz = null;

    public Arvore(int tamanhoNo) {
        raiz = new No(tamanhoNo);
    }

    public void inserir(int numero) {
        RetornoRecursao retorno = inserir(raiz, numero, null);
        if (retorno != null) {
            No novaRaiz = new No(raiz.getChaves().length);
            novaRaiz.setFolha(false);
            novaRaiz.inserir(retorno.getChaveDoMeio(), retorno.getFilhoDoMeio());
            novaRaiz.setFilho(0, raiz);
            raiz = novaRaiz;
        }
    }

    private RetornoRecursao inserir(No raiz, int numero, No filho) {
        // Se não for folha, desce na árvore para encontrar a folha correta
        if (!raiz.isFolha()) {
            int indiceFilho = 0;
            boolean encontrei = false;
            for (int i = 0; i < raiz.getQtdChaves(); i++) {
                if (raiz.getChave(i) > numero) {
                    indiceFilho = i;
                    encontrei = true;
                    break;
                }
            }
            if (!encontrei) {
                indiceFilho = raiz.getQtdChaves();
            }

            // A chamada recursiva tenta inserir no filho
            RetornoRecursao retorno = inserir(raiz.getFilho(indiceFilho), numero, filho);
            
            // Se o filho não "quebrou" (split), termina
            if (retorno == null) return null;
            
            // Se quebrou, precisamos adicionar o valor que subiu no nó atual
            numero = retorno.getChaveDoMeio();
            filho = retorno.getFilhoDoMeio();
        }

        // Caso fácil: o nó atual tem espaço
        if (!raiz.isCheia()) { // Corrigido de estaCheia() para isCheia()
            raiz.inserir(numero, filho);
            return null;
        }
    
        // Caso difícil: Nó cheio, precisa particionar (split)
        // Corrigido: Adicionado "/ 2" para achar o meio corretamente
        int indiceDoMeio = raiz.getChaves().length / 2; 
        int chaveDoMeio = raiz.getChave(indiceDoMeio);

        No novoNo = new No(raiz.getChaves().length);
        novoNo.setFolha(raiz.isFolha());

        int novoIndice = 0;
        // Transfere a metade superior para o novo nó
        for (int i = (indiceDoMeio + 1); i < raiz.getQtdChaves(); i++) {
            novoNo.setChave(novoIndice, raiz.getChave(i));
            novoNo.setFilho(novoIndice, raiz.getFilho(i));
            raiz.setChave(i, 0);
            raiz.setFilho(i, null);
            novoIndice++;
        }

        novoNo.setFilho(novoIndice, raiz.getFilho(raiz.getQtdChaves()));
        raiz.setFilho(raiz.getQtdChaves(), null);
        
        // Corrigido: Era getChave(indiceDoMeio, 0) o que é sintaxe inválida
        raiz.setChave(indiceDoMeio, 0); 

        novoNo.setQtdChaves(novoIndice);
        raiz.setQtdChaves(indiceDoMeio); // A metade inferior fica com o nó original

        // Agora insere a nova chave pendente no lado correto
        if (numero < chaveDoMeio) {
            raiz.inserir(numero, filho);
        } else {
            novoNo.inserir(numero, filho);
        }

        return new RetornoRecursao(chaveDoMeio, novoNo);
    }

    public void imprimir() {
        imprimir(raiz, "");
    }

    private void imprimir(No raiz, String indentacao) {
        if (raiz == null) return;

        System.out.println(indentacao + raiz.imprimirChaves());
        
        // Corrigido: Loop sobre a quantidade exata de filhos para evitar NullPointer e erro de digitação de objFIlho
        if (!raiz.isFolha()) {
            for (int i = 0; i <= raiz.getQtdChaves(); i++) {
                imprimir(raiz.getFilho(i), indentacao + "___");
            }
        }
    }
}