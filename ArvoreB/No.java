public class No {
    private int[] chaves = null;
    private No[] filhos = null;
    private boolean folha = true;
    private int qtdChaves = 0;

    public No(int tamanhoNo) {
        chaves = new int[tamanhoNo];
        filhos = new No[tamanhoNo + 1];
    }

    public int[] getChaves() { return chaves; }
    public void setChaves(int[] chaves) { this.chaves = chaves; }
    public No[] getFilhos() { return filhos; }
    public void setFilhos(No[] filhos) { this.filhos = filhos; }
    public boolean isFolha() { return folha; }
    public void setFolha(boolean folha) { this.folha = folha; }

    // Getters e Setters de Quantidade (Faltavam no original)
    public int getQtdChaves() { return qtdChaves; }
    public void setQtdChaves(int qtdChaves) { this.qtdChaves = qtdChaves; }

    public int getChave(int indice) { return chaves[indice]; }
    public void setChave(int indice, int chave) { chaves[indice] = chave; }
    
    public No getFilho(int indice) { return filhos[indice]; }
    
    // Corrigido para o singular para bater com a chamada da Arvore
    public void setFilho(int indice, No filho) { filhos[indice] = filho; } 

    public boolean isCheia() {
        return (qtdChaves == chaves.length);
    }

    public void inserir(int numero, No filho) {
        if (isCheia()) return;

        int lugarCerto = 0;
        boolean encontrei = false;

        for (int i = 0 ; i < qtdChaves ; i++) {
            if (chaves[i] > numero) {
                lugarCerto = i;
                encontrei = true;
                break;
            }
        }

        if (!encontrei) {
            lugarCerto = qtdChaves;
        }

        // Corrigido: i >= lugarCerto (antes era i <= lugarCerto)
        for (int i = qtdChaves - 1 ; i >= lugarCerto ; i--) { 
            chaves[i + 1] = chaves[i];
            filhos[i + 2] = filhos[i + 1];
        }

        chaves[lugarCerto] = numero;
        filhos[lugarCerto + 1] = filho;
        qtdChaves++;
    } 

    public String imprimirChaves() {
        String retorno = "";
        for (int i = 0 ; i < qtdChaves ; i++) {
            retorno += (", " + chaves[i]);
        }
        if (retorno.length() > 0) retorno = retorno.substring(2);
        return retorno;
    }
}