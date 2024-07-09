public class InsertionSort {

    static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int min = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > min){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = min;
        }
        }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 0, 2, 7, 9, 5 };
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
