package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    //push() method tests
    @Test
    void pushingAValueMakesItTheFirstToComeOut(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("first value");
        testStack.push("second value");
        assertTrue(new String("second value").equals(testStack.peek()));
    }
    ///////////////////////

    //pop() method tests
    @Test
    void poppingAValueReturnsTheLastValueThatEntered(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("first value");
        testStack.push("second value");
        assertTrue(new String("second value").equals(testStack.pop()));
    }
    @Test
    void poppingAValueRemovesItFromStack(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("first value");
        testStack.push("second value");
        testStack.push("third value");
        testStack.pop();
        assertTrue(new String("second value").equals(testStack.peek()));
    }
    ///////////////////////

    //peek() method tests
    @Test
    void peekingAValueReturnsTheLastValueThatEntered(){
        Stack<String> testStack = new Stack<String>();
        testStack.push("first value");
        testStack.push("second value");
        assertTrue(new String("second value").equals(testStack.peek()));
    }
    ///////////////////////
}
