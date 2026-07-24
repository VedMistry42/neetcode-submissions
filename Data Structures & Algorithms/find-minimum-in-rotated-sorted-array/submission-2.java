class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int l = 0;
        int r = nums.length-1;
        while(l<r) {
            int m = (l+r)/2;
            int curr = nums[m];
            min = Math.min(min,curr);
            if(curr>nums[r]) {
                l = m + 1;
            }
            else {
                r = m-1;
            }
        }
        return Math.min(min,nums[l]);
    }
}
