import java.util.*;
public class DFS_search {
    static Map<Character, List<Character>> graph = new HashMap<>();
    public static void main(String[] args) {
        graph.put('R', Arrays.asList('R', 'J'));
        graph.put('A', Arrays.asList('A', 'R'));
        graph.put('J', Arrays.asList('N'));
        graph.put('A', Arrays.asList('J'));
        graph.put('N', Arrays.asList('A'));
        Set<Character> visited = new HashSet<>();
        System.out.println("DFS Traversal:");
        dfs('A', visited);
    }
    static void dfs(char vertex, Set<Character> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (char neighbor : graph.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }
}

