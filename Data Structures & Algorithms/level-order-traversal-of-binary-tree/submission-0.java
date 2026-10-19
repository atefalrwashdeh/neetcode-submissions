/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) {\ this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int levelSize = deque.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode current = deque.removeFirst();
                currentLevel.add(current.val);
                if(current.left!=null) deque.add(current.left);
                if(current.right!=null) deque.add(current.right);
            }
            res.add(currentLevel);
        }
        return res;
        
    }
}