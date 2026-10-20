import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tree objTree = new Tree();
		int number = 0;
		int size = 10;
		
		// Construção da árvore
		for (int i = 0 ; i < size ; i++) {
			objTree.insert((int) (size * Math.random()));
		}
	
		// Realização de pesquisas
		do {
			System.out.print("Digite um número: ");
			number= scan.nextInt();
			objTree.search(number);
		} while (number != -99);
		scan.close();
		
		// Impressão em ordem crescente
		objTree.navigateInOrder();
	}
}
