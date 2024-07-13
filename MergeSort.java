public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int k = 0;
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            else
                temp[k++] = arr[j++];
            }
        while(i <= mid){
            temp[k++] = arr[i++];
            }

        while(j <= right){
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }

    }


    public static void mergeSort(int[] arr, int l, int h){

        if(l < h){
            int m = (l+h)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, h);
            merge(arr, l, m, h);
        }
    }
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,0,9};
        int l=0;
        int h=arr.length-1;
        mergeSort(arr, l, h);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
