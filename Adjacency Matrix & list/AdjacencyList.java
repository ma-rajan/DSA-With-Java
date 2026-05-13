import java.util.*;
public class AdjacencyList {
    public static void main(String[] args) {
        char[] vertices = {'R', 'A', 'J', 'A'};
        ArrayList<ArrayList<Character>> graph = new ArrayList<>();
        for (int i = 0; i < vertices.length; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, vertices, 'R', 'J');
        addEdge(graph, vertices, 'A', 'R');
        addEdge(graph, vertices, 'J', 'A');
        addEdge(graph, vertices, 'A', 'A');
        printGraph(graph, vertices);
    }
    static void addEdge(ArrayList<ArrayList<Character>> graph, char[] vertices, char src,char dest) {
        int srcIndex = getIndex(vertices, src);
        int destIndex = getIndex(vertices, dest);
        graph.get(srcIndex).add(dest);
        graph.get(destIndex).add(src);
    }
    static int getIndex(char[] vertices, char vertex) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == vertex) {
                return i;
            }
        }
        return -1;
    }
    static void printGraph(ArrayList<ArrayList<Character>> graph, char[] vertices) {
        System.out.println("Adjacency List:\n");
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(vertices[i] + " -> ");
            for (Character vertex : graph.get(i)) {
                System.out.print(vertex + " -> ");
            }
            System.out.println("NULL");
        }
    }
}

