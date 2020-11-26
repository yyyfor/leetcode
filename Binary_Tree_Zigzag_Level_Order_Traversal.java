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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new LinkedList<List<Integer>>();
        getList(root,result,0);
        return result;
    }
    
    public static void getList(TreeNode node, List<List<Integer>> result, int level) {
        if (node == null) return ;  
        
        if(result.size() == level) {
            List<Integer> list = new LinkedList<Integer>();
            result.add(list);
        }
        List<Integer> tempLevel = result.get(level);
        if(level % 2 == 0) {
            tempLevel.add(node.val);
        } else {
            tempLevel.add(0,node.val);
        }
        
        getList(node.left, result, level+1);
        getList(node.right, result, level+1);
        
    }
}