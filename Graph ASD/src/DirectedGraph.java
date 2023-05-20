import java.util.*;

public class DirectedGraph {
    private int V;
    public LinkedList<Integer>[] adjacencyList;
    int[] DFS = new int[110];
    int[] BFS = new int[110];
    int x = 0;
    int y = 0;

    @SuppressWarnings("unchecked")
    public DirectedGraph(int V) {
        this.V = V;

        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    public void removeEdge(int src, int dest) {
        adjacencyList[src].remove(Integer.valueOf(dest));
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            this.BFS[x] = currentVertex;
            x++;
            

            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        this.DFS[y] = v;
        y++;
        

        for (int n : adjacencyList[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }

    boolean isSame (){
        boolean status = Arrays.equals(this.DFS, this.BFS);
        return status;

    }
}