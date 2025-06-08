import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return arr;
        
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

        return arr;
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }
        
        while (left <= mid) {
            temp.add(arr[left++]);
        }
        
        while (right <= high) {
            temp.add(arr[right++]);
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
        int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArr));
    }
}
