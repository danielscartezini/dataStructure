public class Principal {
    public static void main(String[] args) {
        Arvore objArvore = new Arvore(3);
        int tamanho = 10;

        for (int i = 0 ; i < tamanho ; i++) {
            objArvore.inserir((int) (tamanho * Math.random()));
        }
        objArvore.imprimir();
    }
}
