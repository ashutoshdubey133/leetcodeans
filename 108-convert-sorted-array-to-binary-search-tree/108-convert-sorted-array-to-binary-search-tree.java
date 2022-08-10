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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructor(nums,0,nums.length-1);
    }
    
    public TreeNode constructor(int []nums, int low,int high){
        if(low > high){
            return null;
        }
        
        int mid = (low+high)/2;
        
        TreeNode temp = new TreeNode(nums[mid]);
        temp.left = constructor(nums,low,mid-1);
        temp.right = constructor(nums,mid+1,high);
        
        return temp;
    }
}