public class BubbleSort {
    static int[] bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 1; i--) {
            int swap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = 1;
                }
            }
            if(swap == 0) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Sorted Array: ");
        for(int num: bubbleSort(arr, n)) {
            System.out.print(num + " ");
        }
    }
}
