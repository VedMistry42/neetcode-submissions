class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        Map <Character,Integer> map = new HashMap<>();
        int max = 0;
        while (r<s.length()){
            char point = s.charAt(r);
            if(map.containsKey(point) && map.get(point)>=l){
                l=map.get(point)+1;
            }
            map.put(point,r);
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
