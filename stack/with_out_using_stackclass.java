import java.util.Scanner;
public class with_out_using_stackclass {
    static int Max=5;
    static int stack[]=new int[Max];
    static int top=-1;
    static Scanner obj=new Scanner(System.in);
        static void push(){
            int value;
            if(top==Max-1){
                System.out.println("Stack Overflow");
            }else{
                System.out.print("Enter a number : ");
                value=obj.nextInt();
                top++;
                stack[top]=value;
                System.out.println("Element pushed");
            }
        }
        static void pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
            }else{
                int num=stack[top];
                System.out.println("Top of stack element is : "+num);
                top--;
                System.out.println("Element poped");
            }
        }
        static void peek(){
            if(top==-1){
                System.out.println("Empty stack");
            }else{
                System.out.println("Top of stack element is : "+stack[top]);
            }
        }
        static void display(){
            if(top==-1){
                System.out.println("Empty stack");
            }else{
                int i;
                System.out.println("stack elements : ");
                for(i=top;i>=0;i--){
                    System.out.print(stack[i]+"\t");
                }
            }
        }
    public static void main(String[] args) {
        int choice;
        while (true) { 
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n");
           System.out.print("Enter your choice : ");
           choice=obj.nextInt();
             switch(choice){
                case 1:
                    push();
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
             }

        }
    }    
}
