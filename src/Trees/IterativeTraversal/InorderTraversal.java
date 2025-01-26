package Trees.IterativeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode temp = root;

        while (true) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }else {
                if (stack.isEmpty()){
                    break;
                }
                temp=stack.pop();
                list.add(temp.val);
                temp=temp.right;
            }
        }

        return list;
    }
}
