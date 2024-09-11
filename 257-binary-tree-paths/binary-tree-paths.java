class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        // DFS Approach
        // TC: O(n), SC: O(h)
        List<String> paths = new ArrayList<>();
        List<Integer> curPath = new ArrayList<>();
        // root != null according to problem constraint
        dfs(root, paths, curPath);
        return paths;
    }
    
    private void dfs(TreeNode root, List<String> paths, List<Integer> curPath) {
        // if statement in the parent level ensures root != null
        curPath.add(root.val);
        if (root.left == null && root.right == null) {
            // leaf is found, now curPath is a root-to-leaf path
            paths.add(pathToString(curPath));
        }
        if (root.left != null) {
            dfs(root.left, paths, curPath);
        }
        if (root.right != null) {
            dfs(root.right, paths, curPath);
        }
        // Reset curPath
        curPath.remove(curPath.size() - 1);
    }
    
    // Helper function to convert the path into a string
    private String pathToString(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        sb.append("" + path.get(0));
        for (int i = 1; i < path.size(); i++) {
            sb.append("->" + path.get(i));
        }
        return sb.toString();
    }
}