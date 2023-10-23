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
       if(root==p||root==q)
       return root;
        if(temp.val>p.val && temp.val>q.val )
         return lowestCommonAncestor(temp.left,p,q);
         if(temp.val<p.val && temp.val<q.val)
        return lowestCommonAncestor(temp.right,p,q);
         if(p.val<root.val && q.val>root.val)
        return temp;
   return root;
    }
}