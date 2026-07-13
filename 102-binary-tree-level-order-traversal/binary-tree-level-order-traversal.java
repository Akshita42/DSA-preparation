class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        q.offer(root);

        while(!q.isEmpty()) {

            int len = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            while(len > 0) {

                TreeNode temp = q.poll();

                level.add(temp.val);

                if(temp.left != null)
                    q.offer(temp.left);

                if(temp.right != null)
                    q.offer(temp.right);

                len--;
            }

            ans.add(level);
        }

        return ans;
    }
}