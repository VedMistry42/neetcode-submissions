class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        Map <Character,Integer> hash = new HashMap<>();
        int max = 0;
        int curr = 0;
        while (r<s.length()){
            char point = s.charAt(r);
            if(hash.containsKey(point)){
                l=hash.get(point)+1;
                r=l;
                hash = new HashMap<>();
                curr=0;
            }
            else{
                hash.put(point,r);
                curr++;
                max = Math.max(max,curr);
                r++;
            }
        }
        return max;
    }
}
