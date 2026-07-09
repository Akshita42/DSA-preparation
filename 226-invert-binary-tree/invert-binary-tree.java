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
    private void swapValue(TreeNode child){
        if(child==null) return;
        TreeNode temp=child.left;
        child.left=child.right;
        child.right=temp;
        swapValue(child.left);
        swapValue(child.right);
    }
  public TreeNode invertTree(TreeNode root){
    if(root==null) return null;
    swapValue(root);
    return root;
  }
}