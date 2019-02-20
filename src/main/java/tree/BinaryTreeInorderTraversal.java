package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null)
            return result;

        if(root.left !=null){
            List<Integer> list1 = inorderTraversal(root.left);
            result.addAll(list1);
        }

        result.add(root.val);

        if(root.right !=null){
            List<Integer> list2 = inorderTraversal(root.right);
            result.addAll(list2);
        }

        return result;
    }
}
