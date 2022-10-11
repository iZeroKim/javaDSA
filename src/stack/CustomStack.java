package stack;

public class CustomStack {
    private int capacity;
    private int top;
    private String arr[];

    CustomStack(int size) {
        arr = new String[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size(){
        return top + 1;
    }

    public void  push(String newString){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(-1);
        }
        arr[++top] = newString;

    }

    public void  pop(){
        if(isEmpty()){
            System.out.println("Target stack empty");
            System.exit(-1);
        }
        System.out.println(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i];
        }
        System.out.println(arr);

    }

    public String peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }

        return "-1";
    }


}
