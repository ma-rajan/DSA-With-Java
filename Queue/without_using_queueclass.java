import java.util.Scanner;
public class without_using_queueclass {
    static Scanner obj=new Scanner(System.in);
    static int max=5;
    static int queue[]=new int[max];
    static int front=-1;
    static int rear=-1;
    static void insert(){
        if(rear==max-1){
            System.out.println("Queue Overflow");
        }else{
            if(front==-1 ){
                front=0;
            }
            int value;
            System.out.println("Enter a value : ");
            value=obj.nextInt();
            rear++;
            queue[rear]=value;
            System.out.println("Value is inserted");
        }
    }

    static void delete(){
        if(front==-1 || front>rear){
            System.out.println("Underflow queue");
        }else{
            
            System.out.println("Delete a element in queue : "+queue[front]);
            front++;
        }
    }

    static void display(){
        if(front==-1){
            System.out.println("Underflow queue");
        }else{
            System.out.println("Queue elements : ");
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+"\t");
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        while (true) { 
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit\n");
           System.out.print("Enter your choice : ");
           choice=obj.nextInt();
             switch(choice){
                case 1:
                    insert();
                
                    break;
                case 2:
                    delete();   
                    break;
                case 3:
                   display();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice");
             }

            }
    }    
}
