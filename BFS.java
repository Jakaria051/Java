package bfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 import java.io.*;
import java.util.*;
 
class Graph
{
    private int V;  
    private LinkedList<Integer> adj_matrix[]; 
 
    Graph(int v)
    {
        V = v;
        adj_matrix = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_matrix[i] = new LinkedList();
    }
 
    void addEdge(int v,int w)
    {
        adj_matrix[v].add(w);
    }
 
    
    void BFS(int s)
    {
    
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj_matrix[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
 public class BFS
  {
        
  public static void main(String[] args) {
      
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
      
  Graph g = new Graph(n);
  
  for(int i=0;i<n;i++)
    {
       int r,c;
       r = in.nextInt();
       c = in.nextInt();
       g.addEdge(r, c);  
     
    }
 

 
        System.out.println("Following is Breadth First Traversal...Plz Enter starting from vertex ");
 
       int start;
       start = in.nextInt();
       g.BFS(start);

    }
}
/*
simple input
6
0 1
0 2
1 2
2 0
2 3
3 3 
starting vertex 
2
output will be
2 0 3 1 
*/