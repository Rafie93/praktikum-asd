package blindsearch;

import java.util.HashMap;
import java.util.Map;

class Graph {
    private Map<String, Node> nodes = new HashMap<>();

    public void addNode(String name) {
        nodes.putIfAbsent(name, new Node(name));
    }

    public Node getNode(String name) {
        return nodes.get(name);
    }

    public void addEdge(String from, String to) {
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);
        if (fromNode != null && toNode != null) {
            fromNode.addNeighbor(toNode);
            // Untuk graph tidak berarah, tambahkan juga sebaliknya
            toNode.addNeighbor(fromNode);
        }
    }
}