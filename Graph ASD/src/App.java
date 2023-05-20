import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
        DirectedGraph graph = new DirectedGraph(n);
    
        for (int i = 0; i <= n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.addEdge(a, b);
            graph.addEdge(b, a);
        }
    
        int v = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            
        }
        
    
        graph.BFS(v);
        graph.DFS(v);
    
        
        if (graph.isSame())
            System.out.println("Anjay sama");
        else
            System.out.println("Yah beda :(");
        
        sc.close();
    } 
}