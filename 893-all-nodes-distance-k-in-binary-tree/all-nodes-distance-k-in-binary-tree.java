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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        buildParentMap(root,parent);
        Queue<TreeNode> q= new LinkedList<>();
        HashSet<TreeNode> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int distance=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(distance==k){
                break;
            }
            distance++;
            for (int i=0;i<size;i++){
                TreeNode current=q.poll();
                if(current.left!=null && !visited.contains(current.left)){
                    visited.add(current.left);
                    q.offer(current.left);
                }
                if(current.right!=null && !visited.contains(current.right)){
                    visited.add(current.right);
                    q.offer(current.right);
                }
                if(parent.containsKey(current)&& !visited.contains(parent.get(current))){
                    visited.add(parent.get(current));
                    q.offer(parent.get(current));
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
        private void buildParentMap(TreeNode root, HashMap<TreeNode,TreeNode>parent){
            Queue<TreeNode>q=new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode temp=q.poll();
                if(temp.left!=null){
                    parent.put(temp.left,temp);
                    q.offer(temp.left);
                }if(temp.right!=null){
                    parent.put(temp.right,temp);
                    q.offer(temp.right);
                }
            }

        }
    
}