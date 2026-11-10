public class RetornoRecursao {
    private int chaveDoMeio = 0;
    private No filhoDoMeio = null;

    // Construtor vazio (padrão)
    public RetornoRecursao() {
    }

    // Construtor cheio (com parâmetros)
    public RetornoRecursao(int chaveDoMeio, No filhoDoMeio) {
        this.chaveDoMeio = chaveDoMeio;
        this.filhoDoMeio = filhoDoMeio;
    }

    // Getters e Setters
    public int getChaveDoMeio() {
        return chaveDoMeio;
    }

    public void setChaveDoMeio(int chaveDoMeio) {
        this.chaveDoMeio = chaveDoMeio;
    }

    public No getFilhoDoMeio() {
        return filhoDoMeio;
    }

    public void setFilhoDoMeio(No filhoDoMeio) {
        this.filhoDoMeio = filhoDoMeio;
    }
}