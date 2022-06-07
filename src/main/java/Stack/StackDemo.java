package Stack;

public class StackDemo {

    public static void main(String[] args) {
        /*Stack is a linear data structure which follows a particular order in which the operations are performed.
        The order may be LIFO(Last In First Out) or FILO(First In Last Out).
            stack:
	            push: O(1)
	            pop: O(1)
	            peek: O(1)
	    */
        Stack<String> demo = new Stack<String>();
        //add some values to stack
        demo.push("a");
        demo.push("b");
        demo.push("c");
        demo.push("d");
        demo.push("e");
        //pop three values
        demo.pop();
        demo.pop();
        demo.pop();
        //peek current value, must be "b"
        String current = demo.peek();
        System.out.println("current stack value: "+current);
        //print full stack state
        demo.print();
    }
}
