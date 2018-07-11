package dfs;
import java.io.*;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
 
/**
 *
 * @author jakaria
 */

class Graph
{
   private int V; 
   private LinkedList<Integer> abc[];
   
   Graph(int v)
   {
	V = v;
	abc = new LinkedList[v];
	for (int i=0; i<v; ++i)
	abc[i] = new LinkedList();
	}

	void addEdge(int v, int w)
	{
		abc[v].add(w); 
	}

	void DFSUtil(int v,boolean visited[])
	{
		visited[v] = true;
		System.out.print(v+" ");

		Iterator<Integer> i = abc[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	void DFS(int v)
	{
		
		boolean visited[] = new boolean[V];
		DFSUtil(v, visited);
	}

	
}


public class DFS {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num Of Vertex");
        int n = in.nextInt();
  
        

		Graph g = new Graph(n);
                
                for(int i=0;i<n;i++)
                {
                    int r,c;
                    r = in.nextInt();
                    c = in.nextInt();
                    g.addEdge(r, c);  
                }
                
		

		System.out.println("Following is Depth First Traversal "+"Plz Enter starting from vertex");
                int start;
                start = in.nextInt();

		g.DFS(start);



    }
    
}


//
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
2 0 1 3 
*/
