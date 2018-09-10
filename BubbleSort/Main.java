public class Main {
    public static void main(String args[]){
        int arr[] = { 4, 3, 90, 70, 1 };

        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }

        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if(arr[i] == arr[j]){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
