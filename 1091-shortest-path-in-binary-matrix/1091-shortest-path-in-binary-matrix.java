class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{0,0,1});
        grid[0][0]=1;
        int[][] directions={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        while(!q.isEmpty()){
            int[] current=q.poll();
            int row=current[0];
            int col=current[1];
            int distance=current[2];
            if(row==n-1 && col==n-1){
                return distance;
            }
            for(int[] dir:directions){
                int newRow=row+dir[0];
                int newCol=col+dir[1];
            
                if(newRow>=0 && newRow <n && newCol >= 0 &&     newCol<n &&  grid[newRow][newCol]==0){
                    grid[newRow][newCol]=1;
                    q.offer(new int[]{
                        newRow,
                        newCol,
                        distance+1
                    });
                }

            }
        }
        return -1;
    }
}