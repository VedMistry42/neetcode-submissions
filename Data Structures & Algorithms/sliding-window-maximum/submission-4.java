class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) {
            return nums;
        }
        int[] ans = new int[nums.length-k+1];
        PriorityQueue <Integer> pq = new PriorityQueue <> ((a,b)->b-a);
        for(int i=0; i<k; i++) {
            pq.add(nums[i]);
        }
        ans[0] = pq.peek();
        int r = k;
        while(r<nums.length) {
            int left = nums[r-k];
            int curr = nums[r];
            int max = pq.peek();
            if(curr>max) {
                ans[r-k+1]=curr;
                pq.remove(left);
            }
            else if(left == max) {
                pq.poll();
                ans[r-k+1] = Math.max(pq.peek(),curr);
            }
            else{
                ans[r-k+1] = max;
                pq.remove(left);
            }
            pq.add(curr);
            r++;
        }
        return ans;
    }
}
