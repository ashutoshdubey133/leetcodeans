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
    List<Integer> elements(TreeNode root){
        if(root == null){
            List<Integer> base = new ArrayList<>();
            return base;
        }
        
        List<Integer> left = elements(root.left);
        List<Integer> right = elements(root.right);
        
        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        ans.addAll(left);
        ans.addAll(right);
        
        return ans;
        
    }
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> t1 = elements(root1);
        List<Integer> t2 = elements(root2);
        
        List<Integer> sol = new ArrayList<>();
        sol.addAll(t1);
        sol.addAll(t2);
        
        Collections.sort(sol);
        return sol;
    }
}