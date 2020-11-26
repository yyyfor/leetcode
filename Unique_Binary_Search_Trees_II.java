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
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList();
        List<TreeNode> result = generateTree(1,n);
        return result;
    }
    
    public static List<TreeNode> generateTree(int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        
        if (start > end) {
            list.add(null);
        }
        
        List<TreeNode> lefts, rights;
        for(int i = start ; i <= end; i++) {
            lefts = generateTree(start, i -1);
            rights = generateTree(i+1, end);
        

            for(TreeNode left: lefts) {
                for(TreeNode right: rights) {
                    TreeNode node = new TreeNode(i);
                    node.left = left;
                    node.right = right;
                    list.add(node);
                }
            }
        }
        
        return list;
    }
}