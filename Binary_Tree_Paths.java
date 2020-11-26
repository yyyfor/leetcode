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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList();
        List<String> result = new ArrayList<String>();
        StringBuilder builder = new StringBuilder();
        helper(root,builder, result);
        return result;
    }
    
    public void helper(TreeNode node, StringBuilder sb, List<String> list) {
        if (node == null) return ;
        StringBuilder sb_new = new StringBuilder(sb.toString());
        if(node.left == null && node.right == null) {
            sb_new.append(String.valueOf(node.val));
            list.add(sb_new.toString());
        } else {
            sb_new.append(String.valueOf(node.val));
            sb_new.append("->");
        }
        helper(node.left, sb_new, list);
        helper(node.right, sb_new, list);
    }
}