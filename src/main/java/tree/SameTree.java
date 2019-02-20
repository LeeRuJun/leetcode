package tree;

public class SameTree {

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;

        if(p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }



    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symm(root.left, root.right);
    }

    boolean symm(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        if((node1 == null && node2 !=null) || (node1 !=null && node2 ==null) ) return false;
        return (node1.val == node2.val) && symm(node1.left, node2.right) && symm(node1.right, node2.left);
    }

}
