class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        // Reverse whole array
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Reverse first k elements
        int l1 = 0;
        int r1 = k - 1;

        while (l1 < r1) {
            int temp = nums[l1];
            nums[l1] = nums[r1];
            nums[r1] = temp;

            l1++;
            r1--;
        }

        // Reverse remaining elements
        int l2 = k;
        int r2 = n - 1;

        while (l2 < r2) {
            int temp = nums[l2];
            nums[l2] = nums[r2];
            nums[r2] = temp;

            l2++;
            r2--;
        }
    }
}