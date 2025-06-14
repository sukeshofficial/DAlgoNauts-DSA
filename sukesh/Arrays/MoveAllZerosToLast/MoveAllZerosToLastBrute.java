import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToLastBrute {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static int[] moveZerosToEnd(int[] arr, int n) {
        int j = -1;

        // if arr[i] == 0 point the j variable to this ith index
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // if j value is not changed then there are no zero element
        if (j == -1)
            return arr;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr[i], arr[j]);
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + 1 + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("Before moving all zeros to end : " + Arrays.toString(arr));
        System.out.println("After moving all zeros to end  : " + Arrays.toString(moveZerosToEnd(arr, n)));
    }
}