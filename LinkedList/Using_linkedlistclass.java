import java.util.LinkedList;
import java.util.Scanner;

public class Using_linkedlistclass {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Scanner obj = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1.Insert Beginning");
            System.out.println("2.Insert Last");
            System.out.println("3.Delete Beginning");
            System.out.println("4.Delete Last");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    int value;
                    System.out.print("Enter value : ");
                    value = obj.nextInt();
                    linkedlist.addFirst(value);
                    System.out.println("Data inserted at beginning");
                    break;
                case 2:
                    int data;
                    System.out.print("Enter value : ");
                    data = obj.nextInt();
                    linkedlist.addLast(data);
                    System.out.println("Data inserted at last");
                    break;

                case 3:
                    if (linkedlist.isEmpty()) {
                        System.out.println("Underflow");
                    } else {
                        int num = linkedlist.removeFirst();
                        System.out.println("Deleted element is : " + num);
                    }
                    break;
                case 4:
                    if (linkedlist.isEmpty()) {
                        System.out.println("Underflow");
                    } else {
                        int n = linkedlist.removeLast();
                        System.out.println("Deleted element is : " + n);
                    }
                    break;
                case 5:
                    if (linkedlist.isEmpty()) {
                        System.out.println("Linked List is Empty");
                    } else {
                        System.out.println("Linked List Elements are : ");
                        System.out.println(linkedlist);
                    }
                    break;
                case 6:
                    System.out.println("Program Ended");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}