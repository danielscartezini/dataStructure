
public class Lista {
	private No cabeca = null;
	
	public void inserir(int numero) {
		if (cabeca == null) {
			cabeca = new No(numero, null);
			cabeca.setProximo(cabeca);
			return;
		}
		
		No ultimo = cabeca;
		while (ultimo.getProximo() != cabeca) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero, cabeca));
	}
	
	public void excluir(int numero) {
		// caso muito fácil: Lista vazia
		if (cabeca == null) {
			return;
		}
		
		//caso fácil: excluir o único
		if ((cabeca.getNumero() == numero) && (cabeca.getProximo() == cabeca)) {
			cabeca = null;
			return;
		}
		
	
		// caso dificil: excluir o primeiro no
		if (cabeca.getNumero() == numero) {
			No ultimo = cabeca;
			while(ultimo.getProximo() != cabeca) {
				ultimo = ultimo.getProximo();
			}
			cabeca = cabeca.getProximo();
			ultimo.setProximo(cabeca);
			return;
		}
		
		// caso muito difícil: excluir ni meio ou no fim
		No anterior = cabeca;
		while((anterior.getProximo() != cabeca) && (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		
		if (anterior.getProximo() == cabeca) {
			return;
		}
	}
}
