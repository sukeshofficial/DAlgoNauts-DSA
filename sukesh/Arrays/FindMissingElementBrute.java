public class FindMissingElementBrute {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = -1;
        for (int i = 0; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(i == nums[j]) {
                    flag = true;
                    continue;
                }
            }
            if(flag == false) {
                ans = i;
                return i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums));
    }
}