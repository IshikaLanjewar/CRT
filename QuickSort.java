import java.util.Scanner;

public class QuickSort {
        // Function to perform quick sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left subarray
            quickSort(arr, low, pivotIndex - 1);

            // Recursively sort right subarray
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; 
        int i = low - 1;

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
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0; i<size-1; size++){
            
        }
    }
}
