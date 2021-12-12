// Minimum time taken by each job to be completed given by a Directed Acyclic Graph

import java.io.*;
import java.util.*;

public class MyClass
{
    public static minimumTimeTaken(int v , List<Integer>[] graph)
    {
        int[] indegree = new int[v];
        
        Arrays.fill(indegree,0);
        
        for(int i = 0 ; i < v ; i++)
        {
            for(int node : graph[i])
            {
                indegree[node]++;
            }
        }
        
        Queue<Integer> que = new LinkedList<Integer>();
        
        for(int i = 0 ; i < v ; i++)
        {
            if(indegree[i] == 0)
            {
                que.add(i);
            }
        }
        
        int time = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(que.isEmpty())
        {
           int size = que.size();
           
           for(int i = 0 ; i < size ; i++)
           {
               int src = que.poll();
               ans.add(time);
               for(int node : graph[src])
               {
                   indegree[node]--;
                   if(indegree[node] == 0)
                   {
                       que.add(node);
                   }
               }
           }
           
           time++;
        }
        
        System.out.println(ans);
    }
    public static void main(String args[]) {

    }
}
