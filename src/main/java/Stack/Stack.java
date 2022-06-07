package Stack;

import java.util.ArrayList;

public class Stack <T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T val){
        stack.add(val);
    }

    public T pop(){
        int pos = stack.size()-1;
        if(pos < 0){
            return null;
        }
        T val = stack.get(pos);
        stack.remove(pos);
        return val;
    }

    public T peek(){
        int pos = stack.size()-1;
        if(pos < 0){
            return null;
        }
        T val = stack.get(pos);
        return val;
    }

    public int size(){
        return stack.size();
    }

    public void print(){
        System.out.println("[last out, ..., first out]");
        System.out.println(stack);
    }
}
