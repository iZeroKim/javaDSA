package stack;

import java.util.Iterator;
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

        intStack.push(6);
        intStack.push(2);

        //Iteration
        System.out.println("\nFOREACH() ITERATION");
        System.out.println("Stack elements (LIFO):");
        intStack.forEach(i ->{
            System.out.println(i);
        });

        System.out.println("\nITERATOR() ITERATION");
        Iterator iterator = intStack.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n\n CUSTOM STACK");
        CustomStack myStack = new CustomStack(4);
        myStack.push("Kim");
        myStack.push("Ann");

        System.out.println(myStack.toString());


    }
}
