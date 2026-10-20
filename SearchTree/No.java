
public class No {
	private int number = 0;
	private No left = null;
	private No right = null;
	
	public No(int number, No left, No right) {
		super();
		this.number = number;
		this.left = left;
		this.right = right;
	}
	
	public No() {
		super();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int numero) {
		this.number = numero;
	}
	public No getLeft() {
		return left;
	}
	public void setLeft(No left) {
		this.left = left;
	}
	public No getRight() {
		return right;
	}
	public void setRight(No right) {
		this.right = right;
	}
}
