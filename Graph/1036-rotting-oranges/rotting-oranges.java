class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(m==0 && n==0) return 0;
        Queue<Pair>q= new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        if(q.isEmpty()) return-1;
        int min=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- >0){
                Pair curr=q.poll();
                int r=curr.row;
                int c=curr.col;

                if(r-1>=0 && grid[r-1][c]==1){
                    grid[r-1][c]=2;
                    q.offer(new Pair(r-1,c));
                    fresh--;
                    if(fresh==0) return min+1;
                }
                if(c-1>=0 && grid[r][c-1]==1){
                    grid[r][c-1]=2;
                    q.offer(new Pair(r,c-1));
                    fresh--;
                    if(fresh==0) return min+1;
                }
                if(c+1<n && grid[r][c+1]==1){
                    grid[r][c+1]=2;
                    q.offer(new Pair(r,c+1));
                    fresh--;
                    if(fresh==0) return min+1;
                }
                if(r+1<m && grid[r+1][c]==1){
                    grid[r+1][c]=2;
                    q.offer(new Pair(r+1,c));
                    fresh--;
                    if(fresh==0) return min+1;
                }

            }
            min++;
        }
        return -1;
        
    }
}