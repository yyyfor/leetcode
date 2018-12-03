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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        addVal(list,root.left);
        list.add(root.val);
        addVal(list,root.right);
        return list;
    }
    
    public static void addVal(List list, TreeNode root) {
        if(root == null) return ;
        addVal(list,root.left);
        list.add(root.val);
        addVal(list,root.right);
    }
}