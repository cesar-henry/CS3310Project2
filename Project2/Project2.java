package Project2;

public class Project2 {
    
    // dijkstra algorithm
    public static int[] dijkstra(int[][] graph, int src) {
        int num = graph.length;

        int[] dist = new int[num];
        int[] prev = new int[num];
        boolean[] mark = new boolean[num];

        // initializing dist, prev, and mark arrays
        for (int i = 0; i < num; i++) {
            dist[i] = graph[src][i];
            prev[i] = src;
            mark[i] = false;
        }
        mark[src] = true;
        
        for (int i = 0; i < num - 1; i++) {
            
            // find minimum of the distance array such that the node is reachable and has not been visited
            int u = findMinimum(dist, mark);
            mark[u] = true;

            for(int v = 0; v < num; v++) {
                
                // update shortest paths after obtaining minimum
                if(graph[u][v] != -1 && mark[v] == false) {

                    if(dist[v] > dist[u] + graph[u][v] || dist[v] == -1) {

                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
            
        }
        return dist;
    }

    // floyd-warshall algorithm
    public static int[][] floydWarshall(int[][] graph)
    {

        int v = graph.length;

        int[][] dist = graph;

        // highest represents infinity
        int highest = 10000;

        // replace -1 with highest value because -1 represents infinity
        for(int i = 0; i < v; i++)
        {
            for(int j = 0; j < v; j++)
            {
                if(dist[i][j] == -1)
                    dist[i][j] = highest;
            }
        }

        for(int k = 0; k < v; k++)
        {
            for(int i = 0; i < v; i++)
            {
                for(int j = 0; j < v; j++)
                {
                    if(dist[i][j] > dist[i][k] + dist[k][j])
                    {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }  
        return dist;
    }

    // helper method for dijkstra's algorithm to find minimum distance in distance array
    public static int findMinimum(int[] dist, boolean[] mark) {
        int minimum = 100000;
        int minIdx = -1;
        
        for(int u = 0; u < dist.length; u++) {

            if(mark[u] == false && dist[u] != -1) {

                if(dist[u] < minimum) {

                    minimum = dist[u];
                    minIdx = u;
                }
            }
        }

        return minIdx;
    }
    
    // helper method to print array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // helper method to print 2D array
    public static void print2DArray(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    // helper method to create 2D Array
    public static int[][] create2DArray(int size)
    {
        int[][] array = new int[size][size];
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                array[i][j] = (size * i) + j;
            }
        }
        for(int i = 0; i < size; i++)
        {
            array[i][i] = 0;
        }
        return array;
    }

    // helper method to create a sparse graph
    public static int[][] createSparseGraph(int size)
    {
        int[][] array = new int[size][size];


        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(j == (i + 1))
                    array[i][j] = -1;
            }
        }
        for(int i = 0; i < size; i++)
        {
            array[i][i] = 0;
        }

        return array;
    }
}