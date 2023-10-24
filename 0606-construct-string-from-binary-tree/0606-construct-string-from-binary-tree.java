/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) 
    {     TreeNode t=root;
        if(root==null)
        return "";
     String result = Integer.toString(t.val);
        
        if (t.left != null || t.right != null) {
            result += "(" + tree2str(t.left) + ")";
        }
        
        if (t.right != null) {
            result += "(" + tree2str(t.right) + ")";
        }
        
        return result;
    }
}
    