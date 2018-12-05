/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return helper(root,0);
    }
    
    public static int helper(TreeNode node, int num) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return num * 10 + node.val;
        return helper(node.left, node.val + 10 * num) + helper(node.right, 10 * num + node.val);
    }
}