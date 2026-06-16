class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max=0;
        for(int i:nums) {
            if(!map.containsKey(i)){
                int newLen = 1;
                if(map.containsKey(i-1) && map.containsKey(i+1)){
                    int leftLen = map.get(i-1);
                    int rightLen = map.get(i+1);
                    newLen = 1+leftLen+rightLen;
                    map.put(i-leftLen,newLen);
                    map.put(i+rightLen,newLen);
                    map.put(i,newLen);
                }
                else if(map.containsKey(i-1)){
                    int len = map.get(i-1);
                    map.put(i-len, 1+len);
                    map.put(i,1+len);
                    newLen=1+len;
                }
                else if(map.containsKey(i+1)){
                    int len = map.get(i+1);
                    map.put(i+len, 1+len);
                    map.put(i,1+len);
                    newLen=1+len;
                }
                else{
                    map.put(i,1);
                }
                max = Math.max(max,newLen);
            }
        }
        return max;
    }
}
