package Stack.StackUsingLinkedlist;

public class stackLinkedList {

    private Node top;
    private int length = 0;

    public stackLinkedList() {
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public void pop() {

        if (length == 0) {
            System.out.println("stack is empty");
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            length--;
        }

    }

    public void peek() {

        if (length == 0) {
            System.out.println("stack is empty");
        } else {
            System.out.println("top element = " + top.value);
        }

    }

    public void show() {

        if (length == 0) {
            System.out.println("stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(" --> " + temp.value);
                temp = temp.next;
            }
        }
        System.out.println();
        System.out.println("stack size = " + length);

    }

}
