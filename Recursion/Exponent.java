
import java.util.Scanner;
public class Exponent {
    static int exp(int a,int b){
        if(b<1){
            return 1;
        }else{
            return a*exp(a,b-1);
        }
    }
    public static void main(String[] args) {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter first number : ");
        a=obj.nextInt();

        System.out.print("Enter second number : ");
        b=obj.nextInt();
        System.out.println("Result is : "+exp(a,b));
    }    
}
