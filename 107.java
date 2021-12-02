class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return  new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode currNode = q.poll();
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
                list.add(currNode.val);
            }
            
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
