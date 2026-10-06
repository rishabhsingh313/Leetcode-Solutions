class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int sum = 0;
        
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int avg = sum/k;
        int ans = 0;
        if(avg>=threshold)
        {
            ans++;
        }
        int sum2 = sum;
        int avg2 = 0;
        for(int i = k ; i<arr.length;i++)
        {
            sum = sum - arr[i-k] + arr[i];
            avg2 = sum/k;
            if(avg2>=threshold)
            {
                ans++;
            }
            avg2 = 0;
            
        }
        return ans;
        

    }
}