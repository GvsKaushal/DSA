package Stack.StackUsingArray;

public class stackArray {

    private final int size;
    private final int[] stack;
    private int top = -1;
    private int length = 0;

    stackArray(int size) {
        this.size = size;
        this.stack = new int[size];
    }


    public void push(int data) {

        if (top < size) {
            top++;
            stack[top] = data;
            length++;
            System.out.println(data + " added to stack");
        } else {
            System.out.println("stack is full");
        }
    }

    public void pop() {

        if (top >= 0) {
            stack[top] = 0;
            top--;
            length--;
            System.out.println(stack[top] + " removed from stack");
        } else {
            System.out.println("stack is empty");
        }
    }

    public void peek() {

        if (top >= 0) {
            System.out.println(stack[top] + " top element in stack");
        } else {
            System.out.println("stack is empty");
        }
    }

    public void show() {

        if (top >= 0) {
            System.out.println("------------------------------------");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
            System.out.println("------------------------------------");
        } else {
            System.out.println("stack is empty");
        }
    }

    public void getLength() {
        System.out.println("stack size = " + length);
    }


}
