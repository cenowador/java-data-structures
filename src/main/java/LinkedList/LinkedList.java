package LinkedList;

import java.util.ArrayList;

public class LinkedList <T> {
	private Node<T> head = null;
	private int size = 0;
	public int size(){ return size; }

	//insert value at last position
	public void add(T value){
		insert(size, value);
	}
	//get value at nth position of list
	public T get(int pos){
		if(pos >= 0 && size > pos) {
			Node<T> currentEl = head;
			for (int i = 1; i <= pos; ++i) {
				currentEl = currentEl.getNext();
			}
			return currentEl.getValue();
		}
		return null;
	}
	//set value at nth position of list
	public void set(int pos, T value){
		if(pos >= 0 && size > pos) {
			Node<T> currentEl = head;
			for (int i = 1; i <= pos; ++i) {
				currentEl = currentEl.getNext();
			}
			currentEl.setValue(value);
			return;
		}
		throw new IllegalArgumentException("outside linked list boundaries ["+Integer.toString(pos)+"]/["+Integer.toString(size-1)+"]");
	}
	//remove value at nth position of list
	public void remove(int pos) {
		if(pos >= 0 && size > pos) {
			size -= 1;
			Node<T> beforeEl = head;
			Node<T> iterEl = head;
			Node<T> nextEl = null;
			for (int i = 1; i <= pos; ++i) {
				iterEl = iterEl.getNext();
				if(i == pos-1){
					beforeEl = iterEl;
				}
				else if(i == pos){
					nextEl = iterEl.getNext();
				}
			}
			beforeEl.setNext(nextEl);
			return;
		}
		throw new IllegalArgumentException("outside linked list boundaries ["+Integer.toString(pos)+"]/["+Integer.toString(size-1)+"]");
	}
	//insert value at nth position of list
	public void insert(int pos, T value){
		size += 1;
		Node<T> newEl = new Node<>(value);
		//if list is empty, create first element
		if(pos <= 0) {
			head = newEl;
		}
		//list is not empty, must insert after last element
		else{
			Node<T> last = getElement(pos-1);
			last.setNext(newEl);
		}
	}

	//get the nth node of list
	private Node<T> getElement(int pos){
		if(pos >= 0 && size > pos){
			Node<T> currentEl = head;
			for(int i = 1; i <= pos; ++i){
				currentEl = currentEl.getNext();
			}
			return currentEl;
		}
		throw new IllegalArgumentException("outside linked list boundaries ["+Integer.toString(pos)+"]/["+Integer.toString(size-1)+"]");
	}

	//print list contents
	public void print(){
		ArrayList<T> printList = new ArrayList<>();
		for(int i = 0; i < size; ++i){
			printList.add(get(i));
		}
		System.out.println(printList);
	}
}
