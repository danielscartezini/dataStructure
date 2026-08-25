
public class Lista {
	private No cabeca = null;
	
	// Metodos da classe
	public void inserir(int numero) {
		cabeca = new No(numero, null, cabeca);
		if (cabeca.getProximo() != null) {	// Não é o único nó da lista
			cabeca.getProximo().setAnterior(cabeca);	// Atualizar a referência do anterior
		}
	}
	
	public void excluir( int numero) {
		// Cenário muito fácil: lista valiza
		if (cabeca == null) {
			return;
		}
		
		// Cenário fácil: excluir o primeiro
		if (cabeca.getNumero() == numero) {
			cabeca = cabeca.getProximo();
			if (cabeca != null) {
				cabeca.setAnterior(null);
			}
		}
		
		// Procura pelo número a ser excluido
		No ponteiro = cabeca;
		while((ponteiro != null) && (ponteiro.getNumero() != numero)) {
			ponteiro = ponteiro.getProximo();
		}
		
		// Cenário difícil: não achei
		if(ponteiro == null) {
			return;
		}

		ponteiro.getAnterior().setProximo(ponteiro.getProximo());
		if (ponteiro.getProximo() != null){
			ponteiro.getProximo().setProximo(ponteiro.getAnterior());
		}
	}
	public void imprimir(){
		No ponteiro = cabeca;
		while (ponteiro != null){
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}		 
	}
}
