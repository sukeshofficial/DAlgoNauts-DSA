import java.util.Arrays;

public class MaxFrequency {
    static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxFrequency = 0;
        int left = 0;
        long total = 0; // Make sure to use right datatype

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            while ((long)nums[right] * (right - left + 1) >= total + k) { // Make sure to use right datatype
                total -= nums[left];
                left++;
            }

            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        
        return maxFrequency;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 8, 13 };
        maxFrequency(arr, 5);
    }
}