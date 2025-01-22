package Trees.RecursiveTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        postorder(root);

        return list;
    }

    private void postorder(TreeNode root) {

        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
    }
}
