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
    public int func(TreeNode root,int[] max){
        if(root==null)
            return 0;
        int left = Math.max(func(root.left,max),0);
        int right = Math.max(func(root.right,max),0);
        max[0] = Math.max(max[0],left+right+root.val);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[]{root.val};
        func(root,ans);
        return ans[0];
    }
}
