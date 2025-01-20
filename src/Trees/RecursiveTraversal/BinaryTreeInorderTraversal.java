package Trees.RecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {


    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        inorder(root);

        return list;
    }

    private void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);

    }
}
