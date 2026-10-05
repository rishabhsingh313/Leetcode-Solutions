class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] arr = new int[nums.length];
        int i  = 0;
        int j = 1;


        for(int a:nums)

        {
            if(a>=0)
            {
                arr[i]=a;
                i+=2;
            }
            if(a<0){
                arr[j]=a;
                j+=2;
            }
        }return arr;
    }
}