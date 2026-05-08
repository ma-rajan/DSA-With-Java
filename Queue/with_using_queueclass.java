
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class with_using_queueclass {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList();
        int choice;
        Scanner obj=new Scanner(System.in);
        while (true) { 
            System.out.println("1.Insert\n2.Delete\n3.Display");
            System.out.print("Enter your choice : ");
            choice=obj.nextInt();
            switch(choice){
                case 1:
                    int value;
                    System.out.print("Enter a value : ");
                    value=obj.nextInt();
                    //queue.offer() && queue.add() are used to insert data in queue
                    queue.offer(value);
                    System.out.println("Data is inserted in queue");
                    break;

                case 2:
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty");
                    }
                    //queuq.remove() && queue.poll() are used to remove data in queue
                    queue.remove();
                    System.out.println("Removed a element");
                    break;

                case 3:
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty");
                    }
                    System.out.println(queue);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
            
        }
    }
}
