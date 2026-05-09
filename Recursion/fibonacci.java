
import java.util.Scanner;
public class fibonacci {
    static int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=obj.nextInt();
        for(i=0;i<n;i++){ 
            System.out.print(fibo(i)+"\t");
        }
    }    
}
