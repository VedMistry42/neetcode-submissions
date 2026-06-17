class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            boolean alnumLeft = Character.isLetterOrDigit(l);
            boolean alnumRight = Character.isLetterOrDigit(r);
            if(!alnumLeft){
                left++;
            }
            if(!alnumRight){
                right--;
            }
            if(alnumLeft && alnumRight){
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }
}
