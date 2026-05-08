
//simple linear searching program
/* 
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        int i,n;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element in array  : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=obj.nextInt();
        }
        System.out.print("Enter a search element : ");
        int search=obj.nextInt();
        for(i=0;i<n;i++){ 
            if(arr[i]==search){
                System.out.println(search+" is found at "+ i +" index");
                break;
            }
        }
        if(i==n){
            System.out.println(search+ " is not found ");
        }
    }
}
*/



import java.util.Scanner;
public class linearsearch{
   static int searching(int arr[],int search){
        int i;
        for(i=0;i<arr.length;i++){
            if(search==arr[i]){
                return  i;
            }
        }
        return -1;
   }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i;
        System.out.print("Enter no of element in array : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){ 
            System.out.print("arr["+i+"] : ");
            arr[i]=obj.nextInt();
        }
        System.out.print("Enter a element to search : ");
        int search=obj.nextInt();
       int position;
        position= searching(arr,search);
        if(position!=-1){
        System.out.println(search+" is found at "+position);
    }else{
        System.out.println(search+" is not found");
    }
}
}