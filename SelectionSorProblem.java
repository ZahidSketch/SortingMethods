public class SelectionSorProblem {

    static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        String[] S = {"jaan", "ali", "khan", "dua", "saira", "aman"};
        selectionSort(S);
        for(String s : S){
            System.out.print(s+" ");
        }
    }
}
