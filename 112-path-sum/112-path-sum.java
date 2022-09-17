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
    boolean path = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        if(root==null){
            return path;
        }
        
        int sum = 0;
        dfs(root, targetSum , sum);
        return path;
    }
    public boolean dfs(TreeNode root , int targetSum , int sum){
        
        if(root != null){
            if(root.left==null && root.right==null){
            if(targetSum == sum + root.val){
                path = true;
            }
        }
        
        dfs(root.left , targetSum , sum+root.val);
        dfs(root.right, targetSum , sum+root.val);
        }
       return path;
    }
    
}








