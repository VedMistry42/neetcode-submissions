class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;
        while(l<r){
            int left = height[l];
            int right = height[r];
            leftMax = Math.max(left,leftMax);
            rightMax = Math.max(right,rightMax);
            if(leftMax<rightMax){
                sum+=leftMax-left;
                l++;
            }
            else if(rightMax<leftMax){
                sum+=rightMax-right;
                r--;
            }
            else{
                sum+=leftMax+rightMax-left-right;
                l++;
            }
        }
        return sum;
    }
}
