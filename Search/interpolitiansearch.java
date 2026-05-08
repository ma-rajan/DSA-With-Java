import java.util.Scanner;
public class interpolitiansearch {
    static int search(int arr[], int search) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high &&
                search >= arr[low] &&
                search <= arr[high]) {
            int pos = low + ((search - arr[low]) * (high - low))/(arr[high] - arr[low]);
            // Element found
            if (arr[pos] == search) {
                return pos;
            }
            // Search right side
            if (arr[pos] < search) {
                low = pos + 1;
            }
            // Search left side
            else {
                high = pos - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, i;
        System.out.print("Enter number of elements : ");
        n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter sorted elements:");
        for (i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = obj.nextInt();
        }
        System.out.print("Enter element to search : ");
        int search = obj.nextInt();
        int position = search(arr, search);
        if (position != -1) {
            System.out.println(search + " found at index " + position);
        } else {

            System.out.println(search + " not found");
        }
    }
}
