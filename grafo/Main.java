public class Main {
    public static void main(String[] args) {
        Grafo objGrafo = new Grafo(100);

        objGrafo.construir(true);

        objGrafo.imprimir();

        objGrafo.procurarVerticeMaiorGrau();
    }
}