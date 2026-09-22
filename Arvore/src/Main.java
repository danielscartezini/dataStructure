
public class Main {
	public static void main(String[] args) {
		Arvore objArvore = new Arvore();
		
		for (int i = 0 ; i < 1000000 ; i++) {
			objArvore.inserir(i);
		}
		objArvore.imprimir();
	}
}
