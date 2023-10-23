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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {   TreeNode temp=root;
        if(temp.val>p.val && temp.val>q.val )
         return lowestCommonAncestor(temp.left,p,q);
         else if(temp.val<p.val && temp.val<q.val)
        return lowestCommonAncestor(temp.right,p,q);
   return root;
    }
}