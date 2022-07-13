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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> mq = new ArrayDeque<>();
        ArrayDeque<TreeNode> cq = new ArrayDeque<>();
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(root != null)
        mq.add(root);
        while(mq.size()!=0 || cq.size()!=0){
            List<Integer> currlevel = new ArrayList<>();
            res.add(currlevel);
            
            while(mq.size() != 0){
                TreeNode temp = mq.remove();
                currlevel.add(temp.val);
                if(temp.left != null)
                    cq.add(temp.left);
                if(temp.right != null)
                cq.add(temp.right);
            }
            
            if(mq.size() == 0){
                mq = cq;
                cq = new ArrayDeque<>();
            }
            
        }
        
        return res;
        
    }
}