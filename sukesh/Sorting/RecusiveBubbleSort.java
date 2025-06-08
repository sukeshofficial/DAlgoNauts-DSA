import java.util.Arrays;

public class RecusiveBubbleSort {
    static int[] recursiveBubbleSort(int[] arr, int n) {
        if (n == 1)
            return arr;
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        recursiveBubbleSort(arr, n - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int n = arr.length;
        int[] sortedArr = recursiveBubbleSort(arr, n);
        System.out.println(Arrays.toString(sortedArr));
    }
}
