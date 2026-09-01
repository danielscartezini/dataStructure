
public class Main {
	public static void main(String[] args) {
		Queue objQueue = new Queue();
		for (int i = 0 ; i < 100000 ; i ++) {
			objQueue.entrar(i);
		}
		for (int i = 0 ; i < 100000 ; i ++) {
			objQueue.sair();
		}
	}
}
