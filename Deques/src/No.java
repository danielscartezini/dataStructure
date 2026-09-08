
public class No {
	int numero = 0;
	No proximo = null;
	
	// construtores
	public No() {
		super();
	}
	
	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}
	
	// gets and sets
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numbero) {
		this.numero = numbero;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
		
}
