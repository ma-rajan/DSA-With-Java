
import java.util.Scanner;
import java.util.Stack;
public class with_using_stackclass {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int choice;
        Scanner obj=new Scanner(System.in);
         while (true) { 
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5Exit\n");
           System.out.print("Enter your choice : ");
           choice=obj.nextInt();
             switch(choice){
                case 1:
                    int value;
                    System.out.print("Enter a number : ");
                    value=obj.nextInt();
                    stack.push(value);
                    System.out.println("Element is pushed");
                    break;
                case 2:
                    if(stack.isEmpty()){
                        System.out.println("Empty stack");
                    }else{
                        System.out.println("Stack poped element is : "+stack.pop());
                    }
                    break;
                case 3:
                    if(stack.isEmpty()){
                        System.out.println("Empty stack");
                    }else{
                        System.out.println("Top of stack is : "+stack.peek());
                    }
                    break;

                case 4:
                        if(stack.isEmpty()){
                            System.out.println("Empty stack");
                        }else{
                            System.out.println("Stack elements : "+stack);
                        }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
             }

            }
    }
}
