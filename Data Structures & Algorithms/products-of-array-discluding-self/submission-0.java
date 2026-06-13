class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] work = new int[len];
        work[0]=1;
        int[] suffix = new int[len];
        suffix[len-1]=1;
        for(int i=1;i<len;i++){
            work[i] = nums[i-1]*work[i-1];
            suffix[len-1-i] = nums[len-i]*suffix[len-i];
        }
        for(int i=0;i<len;i++){
            work[i] = work[i]*suffix[i];
        }
        return work;
    }
}  
