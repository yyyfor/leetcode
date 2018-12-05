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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
        helper(root, lists, 0);
        for(List<Integer> list:lists) {
            result.add(list.get(list.size()-1));
        }
        return result;
    }
    
    public void helper(TreeNode node, List<List<Integer>> lists, int level) {
        if (node == null) return ;
        if(lists.size() == level) {
            lists.add(new ArrayList());
        }
        
        List<Integer> list= lists.get(level);
        list.add(node.val);
        helper(node.left, lists, level+1);
        helper(node.right, lists, level+1);
    }
}