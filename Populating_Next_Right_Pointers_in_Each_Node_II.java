/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head = null;
        TreeLinkNode cur = root;
        TreeLinkNode prev = null;
        
        if (root == null) return ;
        
        while(cur != null) {
            while(cur != null) {
                if(cur.left != null) {
                    if(head == null) {
                        head = cur.left;
                        prev = head;
                    } else {
                        prev.next = cur.left;
                        prev = prev.next;
                    }
                }

                if(cur.right != null) {
                    if(head == null) {
                        head = cur.right;
                        prev = cur.right;
                    } else {
                        prev.next = cur.right;
                        prev = prev.next;
                    }
                }
                cur = cur.next;
            }
            
            cur = head;
            head = null;
            prev = null;        
        }
        
    }
}