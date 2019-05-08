package tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Unique_Binary_Search_Trees_II {
    public static void main(String[] args) {
        generateTrees(4);
    }

    public static List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] dp = new ArrayList[n + 1];
        dp[0] = new ArrayList<TreeNode>();
        if (n <= 0) return dp[0];
        dp[0].add(null);
        for(int i = 1; i <= n; i++) {
            List<TreeNode> cur = new ArrayList<TreeNode>();
            dp[i] = cur;
            for (int j = 1; j <= i; j++) {
                List<TreeNode> left = dp[j - 1];
                List<TreeNode> right = dp[i - j];
                for (TreeNode l : left) {
                    for (TreeNode r : right) {
                        TreeNode root = new TreeNode(j);
                        root.left = l;
                        root.right = addNode(r, j);
                        cur.add(root);
                    }
                }
            }
        }
        return dp[n];
    }

    private static TreeNode addNode(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode newRoot = new TreeNode(root.val + val);
        newRoot.left = addNode(root.left, val);
        newRoot.right = addNode(root.right, val);
        return newRoot;
    }
}
