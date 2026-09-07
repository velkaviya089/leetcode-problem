class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=1000000;
        }
        cost[src]=0;
        for(int i=0;i<=k;i++){
            int[] temp=cost.clone();
            for (int[] flight:flights){
                int from=flight[0];
                int to=flight[1];
                int price=flight[2];
                if(cost[from]+price<temp[to]){
                    temp[to]=cost[from]+price;
                }
            }
            cost=temp;               
        }
        if(cost[dst]==1000000){
            return -1;
        }
        return cost[dst];
    }
}
        
    
