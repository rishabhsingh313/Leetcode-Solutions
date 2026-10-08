class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum1 = 0;
        for(int i:nums)
        {
            sum1+=i;
        }

        int sum2 = 0;

        for(int i:nums)
        {
            while(i!=0)
            {
                int dig = i%10;
                sum2+=dig;
                i = i/10;
            }
        }
        return Math.abs(sum1-sum2);

    }
}