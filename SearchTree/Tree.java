
public class Tree {
	private No root = null;
	private int counter = 0;
	
	public void insert(int number) {
		root = insert(root, number);
	}
	
	public void search(int number) {
		search(root, number);
	}
	
	private No insert(No root, int number) {
		// Cenário fácil: árvore vazia
		if (root == null) {
			return new No(number, null, null);
		}
		
		// Cenário difícil: árvore não está vazia
		if (number < root.getNumber()) {
			root.setLeft(insert(root.getLeft(), number));
		} else {
			root.setRight(insert(root.getRight(), number));
		}	
		return root;
	}
	
	private void search(No root, int number) {
		// Cenário MUITO fácil: árvore vazia
		if (root == null) {
			System.out.println("Número não encontrado. Tentei " + counter+ " vezes");
			counter = 0;
			return;
		}
		
		// Cenário fácil: dei sorte e o número procurado é a raiz
		if (number == root.getNumber()) {
			System.out.println("Deu sorte do número procurado estar na raiz");
			counter = 0;
			return;
		}
		
		// Cenário difícil: tem que procurar o número
		counter++;
		if (number < root.getNumber()) {
			search(root.getLeft(), number);
		} else {
			search(root.getRight(), number);
		}
	}
	
	public void navigateInOrder() {
		System.out.print("Navegação EM-ORDEM");
		navigateInOrder(root);
		System.out.println();
	}
	
	public void navigateInOrder(No root) {
		if (root == null) {
			navigateInOrder(root.getLeft());
			System.out.print(root.getNumber());
			navigateInOrder(root.getRight());
		}
	}
}
