class Solution {
    public boolean isPalindrome(String s) {
        String alnum = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = alnum.length();
        for(int i=0; i<len/2;i++){
            if(alnum.charAt(i)!=alnum.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
