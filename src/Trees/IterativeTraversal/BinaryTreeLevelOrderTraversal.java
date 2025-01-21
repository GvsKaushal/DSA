package Trees.IterativeTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {


        TreeNode nodeleft = new TreeNode(3);
        TreeNode noderight = new TreeNode(6);
        TreeNode node = new TreeNode(9, nodeleft, noderight);

        List<List<Integer>> levelOrder = levelOrder(node);
        System.out.println(levelOrder);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            if (!list.isEmpty()) {
                lists.add(list);
            }
        }

        return lists;
    }

}
