package blindsearch;

import java.util.*;

public class DFS {
    public static List<Node> search(Node start, Node goal) {
        Stack<Node> stack = new Stack<>();
        Set<Node> visited = new HashSet<>();
        Map<Node, Node> parentMap = new HashMap<>();

        stack.push(start);
        parentMap.put(start, null);

        while (!stack.isEmpty()) {
            Node current = stack.pop();

            if (current.equals(goal)) {
                return reconstructPath(parentMap, current);
            }

            if (!visited.contains(current)) {
                visited.add(current);
                // Untuk mendapatkan urutan yang konsisten, kita reverse neighbors
                // Agar yang pertama ditambahkan ke stack adalah neighbor pertama
                List<Node> neighbors = new ArrayList<>(current.neighbors);
                Collections.reverse(neighbors); // Optional: untuk urutan tertentu
                
                for (Node neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        parentMap.put(neighbor, current);
                        stack.push(neighbor);
                    }
                }
            }
        }
        return Collections.emptyList();
    }

    private static List<Node> reconstructPath(Map<Node, Node> parentMap, Node goal) {
        List<Node> path = new ArrayList<>();
        Node current = goal;
        while (current != null) {
            path.add(current);
            current = parentMap.get(current);
        }
        Collections.reverse(path);
        return path;
    }
}