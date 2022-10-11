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



    }
}
