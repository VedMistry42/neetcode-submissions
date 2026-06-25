class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int i=0;
        int lTemp = 0;
        int rTemp = 0;
        while(i<len) {
            if(height[i]>lTemp) {
                lTemp = height[i];
            }
            left[i] = lTemp;
            if(height[len-i-1]>rTemp) {
                rTemp = height[len-i-1];
            }
            right[len-i-1] = rTemp;
            i++;
        }
        int sum = 0;
        for(int j=0; j<len; j++) {
            sum+= Math.min(left[j],right[j])-height[j];
        }
        return sum;
    }
}
