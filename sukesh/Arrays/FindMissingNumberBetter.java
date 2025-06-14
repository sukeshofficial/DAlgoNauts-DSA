public class FindMissingNumberBetter {
    static int missingNumber(int[] arr) {
        /*
         * [ 3 | 0 | 1 |   ]
         *   0   1   2   3
         * 
         * [ 0 | 1 | * | 3 ]
         *   0   1   2   3
         */

        int n = arr.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        System.out.println("Missing number: " + missingNumber(nums));
    }
}
