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
    
    int ans = 0;
    public int sumOfLeftLeaves(TreeNode root) {
       
        if(root == null)  return 0;
        
        if(root.left== null && root.right== null) return 0;
       
        return solve(root,false);
    }
    
   int solve(TreeNode root, boolean isleft){
        
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            if(isleft){
               ans += root.val;
            }
        }
        solve(root.left,true);
        solve(root.right,false);
       
       return ans;
     
    }
}