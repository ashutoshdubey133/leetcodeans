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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pAnc = ancestors(root,p);
        List<TreeNode> qAnc = ancestors(root,q);
        
        // pAnc.stream().forEach(a -> System.out.print(a.val + " "));
        // qAnc.stream().forEach(a -> System.out.print(a.val + " "));
        
        TreeNode ans = root;
        
        for(int i=pAnc.size()-1,j=qAnc.size()-1;i>=0 && j>=0;i--,j--){
            if(pAnc.get(i) == qAnc.get(j)){
                 ans = pAnc.get(i);
            }
        }
        
        return ans;
    }
    
    public List<TreeNode> ancestors(TreeNode current,TreeNode target){
        if(current == target){
            List<TreeNode> res = new ArrayList<>();
            res.add(current);
            return res;
        }
        if(current == null){
            return new ArrayList<TreeNode>();
        }
        
        List<TreeNode> res = new ArrayList<>();
        res = ancestors(current.left,target).size()!=0?ancestors(current.left,target):res;
        res = ancestors(current.right,target).size()!=0?ancestors(current.right,target):res;      
        if(res.size() != 0){
            res.add(current);
        }
        return res;
    }
}