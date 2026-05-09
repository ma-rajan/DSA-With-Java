

import java.util.Scanner;
public class insersationsort {
    public static void main(String[] args) {
        int n,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element in array : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            System.out.print("arr["+i+" ] : ");
            arr[i]=obj.nextInt();
        }
        for(i=1;i<n;i++){
            int temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("Inseration sort : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
