import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] nums, int num) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.print("Enter number to find: ");
        int num = s.nextInt();

        int index = linearSearch(arr, num);

        if (index == -1) {
            System.out.println("Number " + num + " is not in the array");
        } else {
            System.out.println("Number " + num + " is at index " + index);
        }
    }
}