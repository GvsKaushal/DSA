package Trees.RecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        preorder(root);

        return list;
    }

    private void preorder(TreeNode root) {

        if (root == null) return;

        list.add(root.val);
        preorder(root.left);
        preorder(root.right);

    }
}
