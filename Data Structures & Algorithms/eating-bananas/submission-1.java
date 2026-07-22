class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int num:piles) {
            max = Math.max(max,num);
        }
        int l = 1;
        int r = max;
        int min = r;
        while(l<r) {
            int mid = (r+l)/2;
            int sum = 0;
            for(int num: piles) {
                sum += (num+mid-1)/mid;
            }
            if(sum <= h) {
                min = mid;
                r = mid;
            }
            else {
                l = mid+1;
            }
        }
        return min;
    }
}
