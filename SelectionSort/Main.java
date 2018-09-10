public class Main {
    public static void main(String args[]){
        int arr[] = { 4, 2, 0, 50, 33 };
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++) {
                if (arr[largest] < arr[i]) {
                    largest = i;
                }
                swap(arr, largest, lastUnsortedIndex);
            }
        }
        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
    }

    public static void swap(int arr[], int i, int j){
        if(arr[i] == arr[j]){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
