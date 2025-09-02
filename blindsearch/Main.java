
package blindsearch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Buat Graph
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");

        // 2. Tambahkan Edge (Hubungan antar node)
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "E");
        graph.addEdge("C", "F");
        graph.addEdge("E", "G");

        // 3. Dapatkan Node Start dan Goal
        Node start = graph.getNode("A");
        Node goal = graph.getNode("G");

        // 4. Jalankan BFS
        System.out.println("=== BFS ===");
        List<Node> bfsPath = BFS.search(start, goal);
        if (bfsPath.isEmpty()) {
            System.out.println("BFS: Tidak ditemukan jalur.");
        } else {
            System.out.println("BFS Path: " + bfsPath);
        }
        
         // 5. Jalankan DFS
        System.out.println("\n=== DFS ===");
        List<Node> dfsPath = DFS.search(start, goal);
        if (dfsPath.isEmpty()) {
            System.out.println("DFS: Tidak ditemukan jalur.");
        } else {
            System.out.println("DFS Path: " + dfsPath);
        }

      
    }
}