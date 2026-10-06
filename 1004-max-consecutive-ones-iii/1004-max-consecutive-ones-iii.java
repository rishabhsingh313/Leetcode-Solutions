class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int zerocounter = 0;
        int maxlength = 0;

        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zerocounter++;
            }
            while(zerocounter>k)
            {   
                if(nums[left]==0)
                {
                zerocounter--;
                }
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}