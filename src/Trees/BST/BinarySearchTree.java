package Trees.BST;

public class BinarySearchTree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            R_insert(root, value);
        }
    }

    private Node R_insert(Node curr, int value) {

        if (curr == null) return new Node(value);

        if (value < curr.value) {
            curr.left = R_insert(curr.left, value);
        } else if (value > curr.value) {
            curr.right = R_insert(curr.right, value);
        }

        return curr;
    }

    public void display() {
        inOrder(root);
        System.out.println();
    }


    private void inOrder(Node temp) {

        if (temp == null) return;

        inOrder(temp.left);
        System.out.print(" " + temp.value);
        inOrder(temp.right);
    }

    public void contains(int value) {
        boolean contain = R_contains(root, value);
        if (contain) {
            System.out.println(value + " found");
        } else {
            System.out.println(value + " Not found");
        }
    }


    private boolean R_contains(Node temp, int value) {

        if (temp == null) return false;

        if (temp.value == value) return true;

        if (value < temp.value) {
            return R_contains(temp.left, value);
        } else {
            return R_contains(temp.right, value);
        }

    }

    public void delete(int value) {
        Node deleted = R_delete(root, value);
    }

    private Node R_delete(Node temp, int value) {

        if (temp == null) return null;

        if (value < temp.value) {
            temp.left = R_delete(temp.left, value);
        } else if (value > temp.value) {
            temp.right = R_delete(temp.right, value);
        } else {

            if (temp.left == null && temp.right == null) {
                return null;
            } else if (temp.left == null) {
                temp = temp.right;
            } else if (temp.right == null) {
                temp = temp.left;
            } else {
                int min = findMinInSubTree(temp.right);
                temp.value = min;
                temp.right = R_delete(temp.right, min);
            }
        }

        return temp;
    }

    private int findMinInSubTree(Node curr) {
        Node temp = curr;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.value;
    }

}
