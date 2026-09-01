
public class No {
	// Propriedades da classe
	private int numero = 0;
	private No proximo = null;
	
	// Metodos contrutores
	public No() {
		super();
	}
	public No(int numero, No cabeca) {
		super();
		this.numero = numero;
		this.proximo = cabeca;
	}
	
	// Getters and Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No cabeca) {
		this.proximo = cabeca;
	}
}
