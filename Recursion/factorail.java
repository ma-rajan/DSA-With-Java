
import java.util.Scanner;
public class factorail {
    static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=obj.nextInt();
        System.out.println("Factorial of "+n+" is : "+fact(n));
    }    
}
