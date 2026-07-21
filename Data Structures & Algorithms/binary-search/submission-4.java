class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r) {
            int m = (r+l)/2;
            int curr = nums[m];
            if(curr==target) {
                return m;
            }
            else if(curr<target) {
                l=m+1;
            }
            else{
                r=m;
            }
        }
        return -1;
    }
}
