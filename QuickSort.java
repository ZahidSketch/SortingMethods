public class QuickSort {

    static int partition( int[] arr, int low, int high) {

        int i = low;
        int j = high + 1;
        int pivot = arr[low];
        while ( i < j) {

            do{
                i++;
            }while( arr[i] < pivot);

            do{
                j--;
            }while( arr[j] > pivot);

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int j = partition(arr, l, h);
            quickSort(arr, l, j-1 );
            quickSort(arr, j + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr ={3,6,1,8,2,0,9};
        int l = 0, h = arr.length-1;
       quickSort(arr, l, h);
       for(int i = l; i <= h; i++) {
           System.out.print(arr[i] + " ");
       }
    }
}
