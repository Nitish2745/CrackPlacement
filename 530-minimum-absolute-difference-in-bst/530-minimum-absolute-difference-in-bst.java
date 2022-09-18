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
     ArrayList<Integer> li=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
      result(root);
        int res=Integer.MAX_VALUE;
      for(int i=li.size()-1;i>0;i--){
          int ans=li.get(i)-li.get(i-1);
          res=Math.min(ans,res);
      }
        return res;
       
    }
    void result(TreeNode root){
        if(root==null)
            return;
        result(root.left);
        li.add(root.val);
        result(root.right);
    }
}