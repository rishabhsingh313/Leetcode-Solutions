class Solution {
    public int trailingZeroes(int n) {
        
        int sum = 0;

        while(n!=0)
        {
            int ans = n/5;
            sum+=ans;
            n=n/5;
        }
        return sum;
    }
}