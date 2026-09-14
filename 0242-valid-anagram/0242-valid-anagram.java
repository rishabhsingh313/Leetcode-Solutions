class Solution {
    public boolean isAnagram(String s, String t) {
        int freq1[] = new int[256];
        int freq2[] = new int[256];

        for (char ch: s.toCharArray())
        {
            freq1[ch]+=1;
        } 
        
        for (char ch: t.toCharArray())
        {
            freq2[ch]+=1;
        }

        return Arrays.equals(freq1,freq2);
    }
}