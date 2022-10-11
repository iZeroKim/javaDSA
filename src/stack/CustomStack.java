package stack;

public class CustomStack {
    private int capacity;
    private int top;
    private String arr[];

    CustomStack(int size){
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
     public boolean isFull(){
        return  top == capacity -1;
     }
}
