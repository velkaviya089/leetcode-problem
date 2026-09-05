class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] state=new int[n];
        List<Integer>answer=new ArrayList<>();
        for (int i=0;i<n;i++){
            if(dfs(i,graph,state)){
                answer.add(i);
            }
        }
        return answer;
        
    }
    public boolean dfs(int node,int[][] graph,int[] state){
        if(state[node]==1){
            return false;
        }
        if(state[node]==2){
            return true;
        }
        state[node]=1;
        for (int next:graph[node]){
            if(!dfs(next,graph,state)){
                return false;
            }
        }
        state[node]=2;
        return true;
    }
}