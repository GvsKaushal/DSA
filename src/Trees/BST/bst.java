package Trees.BST;

public class bst {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(9);
        bst.insert(2);
        bst.insert(10);
        bst.insert(91);
        bst.insert(1);

        bst.display();

        bst.delete(9);

        bst.display();


    }
}
