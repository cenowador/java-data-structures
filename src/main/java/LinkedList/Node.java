package LinkedList;

public class Node <T>{
	private T value = null;
	Node<T> next = null;
	
	public Node(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	public Node<T> getNext() { return next;}
	public void setValue(T value) { this.value = value; }
	public void setNext(Node<T> value) {
		this.next = value;
	}
}
