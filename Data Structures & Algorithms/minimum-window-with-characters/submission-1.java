class Solution {
    public String minWindow(String s, String t) {
        int tlen = t.length();
        int slen = s.length();
        if(tlen > slen) {
            return "";
        }
        Map <Character, Integer> map = new HashMap<>();
        for(int i=0; i<tlen; i++) {
            char curr = t.charAt(i);
            int p = map.getOrDefault(curr,0);
            p++;
            map.put(curr, p);
        }
        String ans = "";
        int ansLen = slen+1;
        int l = 0;
        int r = 0;
        int total = tlen;
        while(r<slen) {
            char right = s.charAt(r);
            if(map.containsKey(right)) {
                int p = map.get(right);
                if(p>0) {
                    total--;
                }
                map.put(right,p-1);
            }
            while(total==0) {
                if(ansLen>r-l+1) {
                    ansLen = r-l+1;
                    ans = s.substring(l,r+1);
                }
                char left = s.charAt(l);
                if(map.containsKey(left)) {
                    int p = map.get(left);
                    p++;
                    if(p>0) {
                        total++;
                    }
                    map.put(left,p);
                }
                l++;
            }
            
            r++;
        }
        return ans;
    }
}
