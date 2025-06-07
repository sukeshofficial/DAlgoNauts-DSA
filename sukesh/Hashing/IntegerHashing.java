import java.util.Scanner;

public class IntegerHashing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // input
        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        // pre-storing (frequency)
        int[] hash = new int[13];
        for(int i : arr) {
            hash[i]++;
        }

        int q = s.nextInt();
        while (q-- >= 1) {
            int num = s.nextInt();
            // fetch
            System.out.println("Count of " + num + ": " + hash[num]);
        }
    }
}
