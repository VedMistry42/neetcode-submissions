class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r) {
            int m = l+(r-l)/2;
            int curr = nums[m];
            if(curr>nums[r]) {
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        return nums[l];
    }
}
