class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        
        int lvl = 0;
        
        while(!q.isEmpty()){
            lvl++;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null) return lvl;

                if(curr.left != null) q.offer(curr.left);
                if(curr.right !=null) q.offer(curr.right);
            }
        }
        return lvl;
    }
}
