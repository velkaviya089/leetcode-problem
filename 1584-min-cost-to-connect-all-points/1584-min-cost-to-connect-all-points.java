class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean[] visited=new boolean[n];
        int[] min=new int[n];
        for(int i=0;i<n;i++){
            min[i]=Integer.MAX_VALUE;
        }
        min[0]=0;
        int cost=0;
        for(int k=0;k<n;k++){
            int u=-1;
            for (int i=0;i<n;i++){
                if(!visited[i] && (u==-1 || min[i]<min[u])){
                    u=i;
                }
            }
            visited[u]=true;
            cost+=min[u];
            for(int v=0;v<n;v++){
                if(!visited[v]){
                    int d=Math.abs(points[u][0] - points[v][0]) + Math.abs(points[u][1]-points[v][1]);
                    if( d<min[v]){
                        min[v]=d;
                    }
                }


            }
        }
        return cost;
        
    }
}