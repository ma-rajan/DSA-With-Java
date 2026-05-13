 import java.util.*;
public class BFS_search {
    static Map<Character, List<Character>> graph = new HashMap<>();
    public static void main(String[] args) {
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', Arrays.asList('A', 'D'));
        graph.put('C', Arrays.asList('A'));
        graph.put('D', Arrays.asList('B'));
        bfs('A');
    }
    static void bfs(char start) {
        Queue<Character> queue = new LinkedList<>();
        Set<Character> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            char vertex = queue.poll();
            System.out.print(vertex + " ");
            for (char neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                 queue.add(neighbor);
                }
            }
        }
    }
}

