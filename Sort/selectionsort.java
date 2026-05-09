
import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        int n,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of elements in array : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){ 
            System.out.print("arr["+i+"] : ");
            arr[i]=obj.nextInt();
        }
        for(i=0;i<n-1;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }

        System.out.println("Selection sort : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
