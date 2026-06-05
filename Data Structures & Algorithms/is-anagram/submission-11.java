class Solution {
    public boolean isAnagram(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        if(slength != tlength){
            return false;
        }
        int[] table = new int[26];
        for(int i=0; i<slength;i++){
            table[s.charAt(i)-'a']++;
            table[t.charAt(i)-'a']--;
        }
        for(int i:table){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
