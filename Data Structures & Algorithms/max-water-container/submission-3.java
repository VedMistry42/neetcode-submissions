class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int max = 0;
        while(i<j){
            int left = heights[i];
            int right = heights[j];
            int curr = (j-i)*Math.min(left,right);
            max= Math.max(curr,max);
            if(right>left){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
