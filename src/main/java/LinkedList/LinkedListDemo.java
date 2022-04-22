package LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		/*A Linked List is a data structure that holds data in memory in a non-contiguous way.
		* It achieves this by creating individual members that hold only two values: its value and
		* the memory address to the next element of the list.
		*
		* access: O(n)
		* 	insertion:
		* 		beginning: O(1)
		* 		end: O(n)
		* 		nth position: O(n)
		* 	deletion:
		* 		beginning: O(1)
		* 		end: O(n)
		* 		nth position: O(n)*/
		LinkedList<String> demoList = new LinkedList<String>();
		//add some values to list
		demoList.add("a");
		demoList.add("b");
		demoList.add("c");
		demoList.add("d");
		demoList.add("e");
		//set value "c" to "replaced value"
		demoList.set(2, "replaced value");
		//delete 'd' from list
		demoList.remove(3);
		demoList.print();
	}

}
