import java.util.Scanner;
public class quicksort {
    void quickSort(int[] arr, int low, int high) {
 if (low < high) {
 int pi = partition(arr, low, high);
 quickSort(arr, low, pi - 1);
 quickSort(arr, pi + 1, high);
 }
}
int partition(int[] arr, int low, int high) {
 int pivot = arr[high];
 int i = (low - 1);
 for (int j = low; j < high; j++) {
 if (arr[j] < pivot) {
 i++;
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 int temp = arr[i + 1];
 arr[i + 1] = arr[high];
 arr[high] = temp;
 return i + 1;
}
public static void main(String[] args) {
    int n,i,j;
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter no  of element in array : ");
    n=obj.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++){ 
        System.out.print("arr["+i+"] : ");
        arr[i]=obj.nextInt();
    }
    int low=0;
    int high=n-1;
   quicksort q=new quicksort();
    q.quickSort(arr,low,high);
    System.out.println("Quick sort: ");
    for(i=0;i<n;i++){ 
        System.out.print(arr[i]+"\t");
    }

}
}
