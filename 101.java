class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left,root.right);
    }
    public boolean isSym(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSym(p.left,q.right) && isSym(p.right,q.left);
    }
}
