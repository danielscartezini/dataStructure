
public class Main extends Thread {
	private Deque objDeque = new Deque();
	private boolean tipo = false;

	public Main(Deque objDeque, boolean tipo) {
		super();
		this.objDeque = objDeque;
		this.tipo = tipo;
	}

	public static void main(String[] args) {
		Deque objDeque = new Deque();
		
		new Principal(objDeque, false).start();
		new Principal(objDeque, true).start();
		
		while (Thread.activecount() > 0) {
			
		}
	}
	
	public void run() {
		try {
			int numero = 0;
			if (tipo) {
				boolean normal = (((int)(2*Math.random())) > 0);
				objDeque.entrar(normal, normal ? numero : 1000 * numero);
				numero++;
			} else {
				objDeque.atender();
			}
		}catch (Exception e){}
	}
}
