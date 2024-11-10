import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        for (int i = 0; i<arr.length; i++) {
            while (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
