import java.util.HashMap;

class LRUCache {

    class Node {

        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;

    HashMap<Integer, Node> hashMap = new HashMap<>();

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        if (hashMap.containsKey(key)) {

            Node node = hashMap.get(key);

            remove(node);

            insert(node);


            return node.value;

        } else {
            return -1;
        }

    }

    public void put(int key, int value) {

        Node newnode = new Node(key, value);

        if (hashMap.containsKey(key)) {
            Node node = hashMap.get(key);

            node.value = value;
            remove(node);
            insert(node);
        } else {

            if (capacity == hashMap.size()) {
                Node node = tail.prev;
                hashMap.remove(node.key);
                remove(node);

                insert(newnode);
                hashMap.put(key, newnode);
            } else {
                insert(newnode);
                hashMap.put(key, newnode);
            }

        }

    }

    public void remove(Node node) {
        Node before = node.prev;
        Node after = node.next;

        before.next = after;
        after.prev = before;
    }

    public void insert(Node node) {
        Node temp = head.next;

        head.next = node;
        node.prev = head;

        temp.prev = node;
        node.next = temp;
    }
}