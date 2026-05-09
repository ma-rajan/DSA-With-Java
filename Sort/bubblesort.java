
import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        int n,i;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element in array : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=obj.nextInt();
        }
        int j,flag;
        for(i=0;i<n-1;i++){
            flag=-1;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==-1){
                break;
            }
        }
        System.out.println("Element in sorted order");
        for(i=0;i<n;i++){ 
            System.out.print(arr[i]+"\t");
        }
    }    
}
