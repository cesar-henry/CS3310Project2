package Project2;
import java.lang.Math.*;

public class Project2TestCases extends Project2 {
    
    public static void main(String[] args)
    {
        // Sanity Check for Dijkstra
        int[][] graphD = {{0,3,-1,2,-1,-1,6},
                            {5,0,6,-1,1,-1,-1},
                            {-1,-1,0,-1,-1,1,-1},
                            {-1,2,-1,0,3,-1,-1},
                            {-1,-1,-1,-1,0,4,-1},
                            {-1,-1,-1,-1,-1,0,-1},
                            {-1,-1,-1,-1,-1,2,0}};
        int[] dijkstraSol = {0, 3, 9, 2, 4, 8, 6};

        System.out.println("\nSanity Check: Dijkstra");
        System.out.println("0 is the src node\nv is the nodes and d is the distance\nExpected distance graph:");
        System.out.print("v: 0 1 2 3 4 5 6\nd: ");
        printArray(dijkstraSol);
        System.out.println("Actual distance graph:");
        System.out.print("v: 0 1 2 3 4 5 6\nd: ");
        int[] dijkstraSC = dijkstra(graphD, 0);
        printArray(dijkstraSC);

        System.out.println();

        // Sanity Check for Floyd-Warshall
        int[][] graphFW = {{0, 3, 8, -1, -4},
                        {-1, 0, -1, 1, 7},
                        {-1, 4, 0, -1, -1},
                        {2, -1, -5, 0, 8},
                        {-1, -1, -1, 6, 0}};
        
        int[][] floydWarshallSol = {{0, 1, -3, 2, -4},
                                    {3, 0, -4, 1, -1},
                                    {7, 4, 0, 5, 3},
                                    {2, -1, -5, 0, -2},
                                    {8, 5, 1, 6, 0}};


        System.out.println("Sanity Check: Floyd-Warshall");
        System.out.println("Expected distance graph:");
        print2DArray(floydWarshallSol);
        System.out.println("Actual distance graph:");
        int[][] floydWarshallSC = floydWarshall(graphFW);
        print2DArray(floydWarshallSC);

        System.out.println();
        
        long start;
        long end;
        long time;

        // Testing Dense Graphs
        System.out.println("Testing Dense Graphs");

        // n = 10
        System.out.println("n = 10");
        int[][] n10 = create2DArray(10);
        start = System.nanoTime();
        dijkstra(n10, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n10);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 20
        System.out.println("n = 20");
        int[][] n20 = create2DArray(20);
        start = System.nanoTime();
        dijkstra(n20, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n20);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 40
        System.out.println("n = 40");
        int[][] n40 = create2DArray(40);
        start = System.nanoTime();
        dijkstra(n40, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n40);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 80
        System.out.println("n = 80");
        int[][] n80 = create2DArray(80);
        start = System.nanoTime();
        dijkstra(n80, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n80);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 100
        System.out.println("n = 100");
        int[][] n100 = create2DArray(100);
        start = System.nanoTime();
        dijkstra(n100, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n100);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 200
        System.out.println("n = 200");
        int[][] n200 = create2DArray(200);
        start = System.nanoTime();
        dijkstra(n200, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n200);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 400
        System.out.println("n = 400");
        int[][] n400 = create2DArray(400);
        start = System.nanoTime();
        dijkstra(n400, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n400);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");


        // n = 800
        System.out.println("n = 800");
        int[][] n800 = create2DArray(800);
        start = System.nanoTime();
        dijkstra(n800, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n800);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 1600
        System.out.println("n = 1600");
        int[][] n1600 = create2DArray(1600);
        start = System.nanoTime();
        dijkstra(n1600, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n1600);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 3200
        System.out.println("n = 3200");
        int[][] n3200 = create2DArray(3200);
        start = System.nanoTime();
        dijkstra(n3200, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(n3200);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");



        // Testing Sparse Graphs

        System.out.println("Testing Sparse Graphs");

        // n = 10
        System.out.println("n = 10");
        int[][] sparse10 = createSparseGraph(10);
        start = System.nanoTime();
        dijkstra(sparse10, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse10);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 20
        System.out.println("n = 20");
        int[][] sparse20 = createSparseGraph(20);
        start = System.nanoTime();
        dijkstra(sparse20, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse20);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 40
        System.out.println("n = 40");
        int[][] sparse40 = createSparseGraph(40);
        start = System.nanoTime();
        dijkstra(sparse40, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse40);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 80
        System.out.println("n = 80");
        int[][] sparse80 = createSparseGraph(80);
        start = System.nanoTime();
        dijkstra(sparse80, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse80);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 100
        System.out.println("n = 100");
        int[][] sparse100 = createSparseGraph(100);
        start = System.nanoTime();
        dijkstra(sparse100, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse100);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 200
        System.out.println("n = 200");
        int[][] sparse200 = createSparseGraph(200);
        start = System.nanoTime();
        dijkstra(sparse200, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse200);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 400
        System.out.println("n = 400");
        int[][] sparse400 = createSparseGraph(400);
        start = System.nanoTime();
        dijkstra(sparse400, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse400);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 800
        System.out.println("n = 800");
        int[][] sparse800 = createSparseGraph(800);
        start = System.nanoTime();
        dijkstra(sparse800, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse800);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 1600
        System.out.println("n = 1600");
        int[][] sparse1600 = createSparseGraph(1600);
        start = System.nanoTime();
        dijkstra(sparse1600, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse1600);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");

        // n = 3200
        System.out.println("n = 3200");
        int[][] sparse3200 = createSparseGraph(3200);
        start = System.nanoTime();
        dijkstra(sparse3200, 0);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Dijkstra Runtime: " + time + " nanoseconds");

        start = System.nanoTime();
        floydWarshall(sparse3200);
        end = System.nanoTime();
        time = end - start;
        System.out.println("Floyd-Warshall Runtime: " + time + " nanoseconds\n");
    }
}
