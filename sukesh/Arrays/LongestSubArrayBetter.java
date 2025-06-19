import java.util.HashMap;

public class LongestSubArrayBetter {
    static int longestSubarray(int[] arr, int k) {
        // sum: Keeps track of the running (prefix) sum of elements from index 0 to i
        // maxLen: Stores the length of the longest subarray with sum exactly equal to k
        // preSumMap: Maps a prefix sum value to its first occurrence index
        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        int n = arr.length;
        int sum = 0;
        int maxLen = 0;

        // Traverse the array once
        for (int i = 0; i < n; i++) {
            // Step 1: Add current element to running sum
            sum += arr[i];

            // Step 2: If the entire subarray from 0 to i sums to k, update maxLen
            if (sum == k) {
                maxLen = i + 1; // Because subarray is from 0 to i (length = i+1)
            }

            // Step 3: Check if there's a previous prefix sum such that:
            // current_sum - previous_sum = k → subarray between those indices sums to k
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                // Subarray from (preSumMap.get(rem) + 1) to i has sum = k
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Step 4: Store the current prefix sum in the map,
            // but only if it's not already there (we want the earliest index)
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        // Final answer: maximum length of any subarray with sum k
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
