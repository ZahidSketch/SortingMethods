public class InsertionSort {

    static void insertionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = { 9, 8, 6, 7, 5, 4 };
        insertionSort(arr);
    }
}
