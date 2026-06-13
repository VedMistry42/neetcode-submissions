class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] work = new int[len];
        work[0]=1;
        
        for(int i=1;i<len;i++){
            work[i] = nums[i-1]*work[i-1];
        }
        int suffix = 1;
        for(int i=len-1;i>=0;i--){
            work[i] = work[i]*suffix;
            suffix = nums[i]*suffix;
        }
        return work;
    }
}  
