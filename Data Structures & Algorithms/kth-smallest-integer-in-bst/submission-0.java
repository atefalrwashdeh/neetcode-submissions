/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> elements = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        kthSmallestHelper(root);
        return elements.get(k - 1);
    }
    private void kthSmallestHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        kthSmallestHelper(root.left);
        elements.add(root.val);
        kthSmallestHelper(root.right);
    }
}
