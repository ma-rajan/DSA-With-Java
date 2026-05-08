
import java.util.Scanner;
public class binarysearch {
    static int search(int arr[],int search){
        int mid;
        int low,high;
        low=0;
        high=arr.length-1;
    
        while(low<=high){
             mid=(low+high)/2;
            if(arr[mid]==search){
                return mid;
            }else if(arr[mid]>search){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            int i,n,search,position;
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter no of elements in array : ");
            n=obj.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++){ 
                    System.out.print("arr["+i+"] : ");
                    arr[i]=obj.nextInt();
            }
            System.out.print("Enter a number to search : ");
            search=obj.nextInt();
             
            position=search(arr,search);
            if(position!=-1){
                System.out.println(search + " element is found at "+i+" index");
            }else{
                System.out.println(search+"  is not found");
            }
        }
}
