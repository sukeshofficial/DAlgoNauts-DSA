public class FindMissingNumberOptimal {
    static int missingNumber(int[] nums) {
        /*
         * Sum of 'n' numbers
         * 
         * sum = n * (n + 1) / 2
         * 
         * ans = sum - sum(arr elements)
         */

        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int sum_arr = 0;
        for (int i = 0; i < n; i++) {
            sum_arr += nums[i];
        }

        return (sum - sum_arr);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 0, 2 };
        System.out.println("Missing number: " + missingNumber(nums));
    }
}