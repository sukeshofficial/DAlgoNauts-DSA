import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = s.nextInt();
        // input
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // selection sort logic
        for (int i = 0; i <= n - 2; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap min element with element at index 'i'
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));

        s.close();
    }
}
