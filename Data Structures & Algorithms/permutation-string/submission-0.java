class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            return false;
        }
        int[] sub = new int[26];
        for(int i=0; i<len1; i++) {
            sub[s1.charAt(i)-'a']++;
            sub[s2.charAt(i)-'a']--;
        }
        if(Arrays.equals(sub,new int[26])){
            return true;
        }
        for(int j=len1; j<len2;j++){
            sub[s2.charAt(j)-'a']--;
            sub[s2.charAt(j-len1)-'a']++;
            if(Arrays.equals(sub,new int[26])){
                return true;
            }
        }
        return false;
    }
}
