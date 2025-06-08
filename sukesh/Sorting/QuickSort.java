import java.util.Arrays;

public class QuickSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
        return arr;
    }

    static int partitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (arr[i] <= pivot && i <= high)
                i++;
            while (arr[j] > pivot && j >= low + 1)
                j--;

            if (i < j)
                swap(arr, i, j);
        }

        swap(arr, low, j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int n = arr.length;
        int[] sortedArr = quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(sortedArr));
    }
}
