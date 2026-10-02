class Solution {
    public int missingNumber(int[] nums) {

        int sum = 0;

        for(int i:nums)
        {
            sum+=i;
        }

        int sum2 = 0;

        for(int i = 0;i<nums.length+1;i++)
        {
            sum2+=i;
        }

        return sum2 - sum;
        
    }
}