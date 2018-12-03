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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode result = helper(0,0,inorder.length-1,preorder,inorder);
        return result;
    }
    
    public static TreeNode helper(int preStart, int inStart, int inEnd, int [] preorder, int [] inorder) {
        if(inStart > inEnd) return null;
        int index = 0 ;
        for(int i = inStart; i <= inEnd; i++) {
            
            if(inorder[i] == preorder[preStart]) {
                index = i;
            }
        }
        
        TreeNode node = new TreeNode(preorder[preStart]);
        node.left = helper(preStart+1, inStart, index-1, preorder, inorder);
        node.right = helper(preStart+index-inStart+1, index+1, inEnd, preorder,inorder);
           
        return node;
        
        
        
        
    }
}