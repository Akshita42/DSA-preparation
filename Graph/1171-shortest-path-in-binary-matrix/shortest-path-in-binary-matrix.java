class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        if(n==1) return 1;
        Queue<Pair> q= new LinkedList<>();
        boolean[][] visited=new boolean[n][n];
        q.offer(new Pair(0,0));
        visited[0][0]=true;
        int dist=1;
        while(!q.isEmpty()){
            int size=q.size();
            dist++;
            while(size-- >0){
                Pair curr=q.poll();
                int r=curr.row;
                int c=curr.col;

                int nr=r-1;
                int nc=c-1;
                if(nr>=0 && nc>=0 && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r-1;
                nc=c;
                if(nr>=0 && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r-1;
                nc=c+1;
                if(nr>=0&&nc<n&& !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r;
                nc=c-1;
                if(nc>=0 && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r;
                nc=c+1;
                if(nc<n && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r+1;
                nc=c-1;
                if(nr<n && nc>=0 && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r+1;
                nc=c;
                if(nr<n && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }
                nr=r+1;
                nc=c+1;
                if(nr<n && nc<n && !visited[nr][nc] && grid[nr][nc]==0){
                    if(nr==n-1 && nc==n-1) return dist;
                    visited[nr][nc]=true;
                    q.offer(new Pair(nr,nc));
                }

            }
        }
        return -1;
    }
}