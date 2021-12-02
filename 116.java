class Solution {
    public Node connect(Node root) {
        if(root==null || root.right==null) return root;
        
        if(root.next != null)
            root.right.next = root.next.left;
        
        root.left.next = root.right;
        connect(root.left);
        connect(root.right);
        return root;
    }
}
