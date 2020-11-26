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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode result = helper(0,inorder.length-1,postorder.length-1, inorder,postorder);
        return result;
    }
    
    public static TreeNode helper(int inStart, int inEnd, int postEnd, int[] inorder, int[] postorder) {
        if (inStart > inEnd) return null;
        int index = 0;
        for(int i = inStart ; i <= inEnd; i++) {
            if(inorder[i] == postorder[postEnd]) {
                index = i;
            }
        }
        TreeNode node = new TreeNode(postorder[postEnd]);
        node.left = helper(inStart, index-1, postEnd - inEnd + index  - 1, inorder,postorder);
        node.right = helper(index+1, inEnd, postEnd-1, inorder,postorder);
        
        return node;
    }
}