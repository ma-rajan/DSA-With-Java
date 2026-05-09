import java.util.Scanner;
public class MergeSort {
       static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
  static  void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        int n,i,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element in array : ");
        n=obj.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){ 
            System.out.print("arr["+i+"] : ");
            arr[i]=obj.nextInt();
        }
        sort(arr, 0,n-1);
            System.out.println("Merge Sort : ");
            for(i=0;i<n;i++){
                System.out.print(arr[i]+"\t");
            }    
    }

}