package stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Kim");
        Stack<Integer> intStack = new Stack<Integer>();

        System.out.println("Stack is empty? "+ intStack.isEmpty());
        intStack.push(9);
        intStack.push(3);
        intStack.push(4);

        System.out.println("Stack is empty? "+ intStack.isEmpty());
        System.out.println("Stack elements: "+ intStack);

        intStack.pop();
        System.out.println("Stack elements after 1st pop: "+ intStack);

        intStack.pop();
        System.out.println("Stack elements after 2nd pop: "+ intStack);

        System.out.println("Element '9' is at position " + intStack.search(9));

        System.out.println("Element at the top of the stack is: "+ intStack.peek());




    }
}
