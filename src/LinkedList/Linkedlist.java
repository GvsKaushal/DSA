package LinkedList;

public class Linkedlist {

    private Node head;
    private Node tail;
    int length = 0;

    Linkedlist() {
    }

    public void Append(int val) {
        Node newnode = new Node(val);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = tail.next;
        }
        length++;
    }

    public Node RemoveLast() {

        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void Prepend(int val) {

        Node newnode = new Node(val);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        length++;
    }

    public Node RemoveFirst() {

        if (length == 0) {
            return null;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    private Node Get(int index) {

        if (index < 0 || index >= length) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean Set(int index, int val) {

        Node temp = Get(index);
        if (temp != null) {
            temp.value = val;
        }
        return false;
    }

    public boolean Insert(int index, int val) {

        if (index < 0 || index > length) return false;

        if (index == 0) {
            Prepend(val);
            return true;
        } else if (index == length) {
            Append(val);
            return true;
        }

        Node newnode = new Node(val);
        Node pre = Get(index - 1);

        newnode.next = pre.next;
        pre.next = newnode;
        length++;
        return true;

    }

    public Node Remove(int index) {

        if (index < 0 || index >= length) return null;

        if (index == 0) {
            return RemoveFirst();
        } else if (index == length - 1) {
            return RemoveLast();
        }

        Node pre = Get(index - 1);
        Node temp = pre.next;

        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    public void display() {
        Node temp = head;

        System.out.println("-----------------------------------------------");

        while (temp != null) {
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
    }

}
