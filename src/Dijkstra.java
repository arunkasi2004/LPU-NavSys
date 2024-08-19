import java.util.*;

public class Dijkstra {
    static final int V = 12; // Increased number of vertices to 12

    int minDistance(int dist[], boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (!sptSet[v] && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    void dijkstra(int graph[][], int src) {
        int dist[] = new int[V]; // The output array. dist[i] will hold the shortest distance from src to i
        boolean sptSet[] = new boolean[V]; // sptSet[i] will be true if vertex i is included in shortest path tree

        // Initialize all distances as INFINITE and sptSet[] as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        printSolution(dist, V);
    }

    void printSolution(int dist[], int n) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < n; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args) {
        // Adding more blocks/shops by increasing the graph to 12 vertices
        int graph[][] = new int[][] {
                //  A   B   C   D   E   F   G   H   I   J   K   L
                {  0,  10,  0,  0,  0,  15,  0,  0,  0,  0,  0,  0 },  // A
                { 10,   0,  20,  0,  0,  0,   0,  25,  0,  0,  0,  0 }, // B
                {  0,  20,  0,  30,  0,  0,   0,  0,  0,  0,  0,  0 },  // C
                {  0,   0,  30,  0,  40,  0,  0,  0,  0,  0,  0,  0 },  // D
                {  0,   0,  0,  40,  0,  50,  0,  0,  0,  0,  0,  0 },  // E
                { 15,   0,  0,  0,  50,  0,  60,  0,  0,  0,  0,  0 },  // F
                {  0,   0,  0,  0,  0,  60,  0,  70,  0,  0,  0,  0 },  // G
                {  0,  25,  0,  0,  0,  0,  70,  0,  80,  0,  0,  0 },  // H
                {  0,   0,  0,  0,  0,  0,   0,  80,  0,  90,  0,  0 },  // I
                {  0,   0,  0,  0,  0,  0,   0,   0,  90,  0, 100,  0 },  // J
                {  0,   0,  0,  0,  0,  0,   0,   0,   0, 100,  0, 110 },  // K
                {  0,   0,  0,  0,  0,  0,   0,   0,   0,   0, 110,  0 }   // L
        };

        Dijkstra t = new Dijkstra();
        t.dijkstra(graph, 0);  // Start from vertex A (index 0)
    }
}
