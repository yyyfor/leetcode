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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        helper(root,result,0);
        List<List<Integer>> result2= new ArrayList<List<Integer>>();
        for(int i = result.size() - 1; i>=0; i--) {
            result2.add(result.get(i));
        }
        return result2;
    }
    
    public static void helper(TreeNode node, List<List<Integer>> result, int level) {
        if(node == null) return ;
        if(result.size() == level) {
            List<Integer> list = new ArrayList<Integer>();
            result.add(list);
        }
        
        List<Integer> temp = result.get(level);
        helper(node.left, result, level+1);
        helper(node.right, result, level+1);
        temp.add(node.val);
    }
}