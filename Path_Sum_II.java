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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        List<Integer> list = new LinkedList<Integer>();
        helper(root,result,list,sum);
        return result;
    }
    
    public static void helper(TreeNode node, List<List<Integer>> result, List<Integer> list, int sum) {
        if (node == null) return ;
        list.add(node.val);
        if(node.left == null && node.right ==null && node.val == sum) {
            result.add(new LinkedList(list));
            list.remove(list.size()-1);
            return ;
        } else {
            helper(node.left, result, list,sum - node.val);
            helper(node.right, result, list ,sum - node.val);
        }
        
        list.remove(list.size()-1);
    }
}