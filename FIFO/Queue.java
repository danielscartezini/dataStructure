
public class Queue {
	// Propriedades da classe
	private No cabeca = null;
	
	// Metodos da classe
	public void entrar(int numero) {
		cabeca = new No(numero, cabeca);
	}
	
	public void sair() {
		// Caso fácil: fila vazia
		if (cabeca == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		// Caso médio: só tem um item na fila
		if (cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}
		
		//Caso difícil: tem mais de um item na fila
		No penultimo = cabeca;
		while(penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
	}
}
