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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root,list);
        return list;
    }
    
    public void helper(TreeNode node, List<Integer> list) {
        if(node == null) return ;
        helper(node.left, list);
        helper(node.right, list);
        list.add(node.val);
    }
}