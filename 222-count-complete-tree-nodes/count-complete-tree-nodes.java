class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return helper(root) - 1;
    }
    private int helper(TreeNode root) {
        if(root == null) return 1;
        return helper(root.right) + helper(root.left);
    }
}