class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        int l = 0;
        int r = 0;
        while(r<s.length()){
            char curr = s.charAt(r);
            freq[curr-'A']++;
            if(maxFreq<freq[curr-'A']){
                maxFreq = freq[curr-'A'];
            }
            if(Math.min(r-l-k+1,s.length())>maxFreq){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max = Math.max(max,Math.min(maxFreq+k,s.length()));
            r++;
        }
        return max;
    }
}
