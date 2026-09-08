
public class Deque {
	private No filaNormal = null;
	private No filaPreferencial = null;
	private int contador = 0;
	
	public void entrar(boolean normal, int numero) {
		if (normal) {
			filaNormal = new No(numero, filaNormal);
		} else {
			filaPreferencial = new No(numero, filaPreferencial);
		}
	}
	
	public void atender() {
		// Caso muito fácil: ambas filas vazias
		if (filaNormal == null && filaPreferencial == null) {
			contador = 0;
			return;
		}
		
		// Caso fácil: só tem na fila normal, fila preferencial está vazia
		if (filaPreferencial == null) {
			filaNormal = sair(filaNormal);
			contador = 0;
			return;
		}
		
		// Caso fácil: só tem na fila preferencial, fila normal está vazia
		if (filaNormal == null) {
			filaPreferencial = sair(filaPreferencial);
			contador = 0;
			return;
		}
		
		// Caso difícil: ambas as filas tem gente
		if (contador < 3) {
			filaPreferencial = sair(filaPreferencial);
			contador++;
		} else {
			filaNormal = sair(filaNormal);
			contador = 0;
		}
			
	}
	
	private No sair(No fila) {
		// Caso 1: Não tem ninguém
		if (fila == null) {
			return null;
		}
		
		// Caso 2: Só tem um único nó na lista
		if (fila.getProximo() == null) {
			System.out.print(fila.getProximo());
			return null;
		}
		
		// Caso 3: fila tem mais de um nó
		No penultimo = fila;
		while(penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
		return fila;		
	}
}
