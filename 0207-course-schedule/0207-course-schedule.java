class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i]=new  ArrayList<>();
        }
        for(int[] p:prerequisites){
            graph[p[1]].add(p[0]);
        }
        int[] visited=new int [numCourses];
        for(int i=0;i<numCourses;i++){
            if(!dfs(i,graph,visited)){
                return false;
            }
        }
        return true;
        
    }
    public boolean dfs(int course,ArrayList<Integer>[]graph,int[] visited){
        if(visited[course]==1){
            return false;
        }
        if(visited[course]==2){
            return true;
        }
        visited[course]=1;
        for(int next:graph[course]){
            if(!dfs(next,graph,visited)){
                return false;
            }
        }
        visited[course]=2;
        return true;
    }
}