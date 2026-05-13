import java.util.Scanner;
public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);        
        int vertices;
        System.out.print("Enter no of vertices : ");
        vertices=obj.nextInt();
        int graph[][]=new int[vertices][vertices];
        int edges;
        System.out.print("Enter no of edges : ");
        edges=obj.nextInt();
        int i,j;
        for(i=0;i<edges;i++){
            System.out.print("Enter starting (starting+ending) edge : ");
            int s=obj.nextInt();
            int e=obj.nextInt();
            graph[s][e]=1;
            graph[e][s]=1;
        }

        System.out.println("\nDisplay Adjacency Matrix ");
        for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    
    }
}
