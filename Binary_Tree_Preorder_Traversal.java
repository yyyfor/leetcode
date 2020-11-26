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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        helper(root,list);
        return list;
    }
    
    public static void helper(TreeNode node, List<Integer> list) {
        if(node == null) return ;
        list.add(node.val);
        helper(node.left,list);
        helper(node.right,list);
    }
}