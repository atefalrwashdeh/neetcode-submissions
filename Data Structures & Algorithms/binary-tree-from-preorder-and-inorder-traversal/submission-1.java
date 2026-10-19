class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        
    }
    private TreeNode buildTreeHelper(int[] preorder, int l, int r, int[] inorder, int l2, int r2) {
        if (l > r || l2 > r2) return null;
        int rootVal = preorder[l];
        TreeNode root = new TreeNode(rootVal);
        int k = l2;
        while (inorder[k] != rootVal) {
            k++;
        }
        root.left = buildTreeHelper(preorder, l + 1, l + k - l2, inorder, l2, k - 1);
        root.right = buildTreeHelper(preorder, l + k - l2 + 1, r, inorder, k + 1, r2);
        return root;
    }
}