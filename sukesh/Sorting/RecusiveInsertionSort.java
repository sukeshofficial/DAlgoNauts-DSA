import java.util.Arrays;

public class RecusiveInsertionSort {
    static int[] recursiveInsertionSort(int[] arr, int i, int n) {
        if (n == i)
            return arr;

        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        recursiveInsertionSort(arr, i + 1, n);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int n = arr.length;
        int[] sortedArr = recursiveInsertionSort(arr, 0, n);
        System.out.println(Arrays.toString(sortedArr));
    }
}
