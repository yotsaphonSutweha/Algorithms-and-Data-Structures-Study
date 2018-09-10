public class QuickSort {
    public static void main (String[] args) {
        int arr[] = { 30, 2, 7, 1, 12, 55, 3 };
        quickSort(arr, 0, arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int insertedPivotIndex = partition(arr, start, end);
        quickSort(arr, start, insertedPivotIndex);
        quickSort(arr, insertedPivotIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        // Using the first element in arr[] as pivot
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            // Empty loop for searching a lesser element on the right of pivot element
            while (i < j && arr[--j] >= pivot) ;
            // Checking if the numbers between i and j is still greater than 1, which means it doesn't overlap
            if (i < j) {
                arr[i] = arr[j];
            }
            // Empty loop for searching a greater element on the left of pivot element
            while (i < j && arr[++i] <= pivot) ;
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        // Return the index value of j for the next round
        return j;
    }
}
