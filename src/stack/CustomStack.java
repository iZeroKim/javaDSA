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
}
