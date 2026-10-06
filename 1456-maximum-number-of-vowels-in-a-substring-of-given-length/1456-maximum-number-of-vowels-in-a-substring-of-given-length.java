class Solution {
    public int maxVowels(String s, int k) {
        
        int sum = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<k;i++)
        {
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                sum++;
            }
        }

        int max = sum;
        for(int i = k;i<arr.length;i++)
        {
            if(arr[i-k]=='a'||arr[i-k]=='e'||arr[i-k]=='i'||arr[i-k]=='o'||arr[i-k]=='u')
            {
                sum--;
            }
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
            {
                sum++;
            }
            max = Math.max(max,sum);
        }
        return max;


    }
}