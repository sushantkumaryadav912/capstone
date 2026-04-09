package capstone_april;

//Course Scheduler order(Simple DAG)
// planning course completion order in university
// given a course (0 to n-1) and prerequisities, return a valid order

import javax.management.Query;
import java.util.*;


public class problem13 {
    public static void main(String[] args){
        int n=4;
        int[][] prereq = {{1,0},{2,0},{3,1},{3,2}};
        System.out.println(topoSort(n,prereq));
    }
    static List<Integer> topoSort(int n, int[][] prereq){
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree=new int[n];

        for (int[]p:prereq){
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();

        for (int i=0;i<n;i++){
            if (indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            result.add(node);
            for (int nei : graph.get(node)){
                indegree[nei]--;
                if (indegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        return result;
    }
}
