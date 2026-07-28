class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while(l<r) {
            int m = l + (r-l)/2;
            int curr = nums[m];
            int left = nums[l];
            int right = nums[r-1];
            if(curr==target) {
                return m;
            }
            else if((left<=curr && (left>target || target>=curr))
            || (left>curr && curr<target && target<=right)) {
                l = m+1;
            }
            else{
                r = m;
            }
        }
        return -1;
    }
}
