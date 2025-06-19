public class LongestSubArrayBrute {
    static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == k) {
                    maxLen = Math.max(maxLen, (j - i + 1));
                }
            }

            // Time Complexity: O(N ^ 2)
            // Extra Space: O(1); no extra space is used.
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        int k = 15;

        System.out.println("Longest SubArray (length): " + longestSubarray(arr, k));
    }
}