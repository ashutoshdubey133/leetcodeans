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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            List<String> res = new ArrayList<>();
            return res;
        }
        
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        
        if(left.size() == 0 && right.size()==0){
            left.add(root.val + "");
            return left;
        }
        
        for(int i=0;i<left.size();i++){
            left.set(i, root.val + "->" + left.get(i));
        }
        
        for(int i=0;i<right.size();i++){
            right.set(i, root.val + "->" + right.get(i));
        }
        
        left.addAll(right);
        return left;           
    }
    
    
}