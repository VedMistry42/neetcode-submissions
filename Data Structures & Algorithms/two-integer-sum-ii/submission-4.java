class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int left = numbers[l];
            int right = numbers[r];
            int total = left + right;
            if(total==target){
                return new int[]{l+1,r+1};
            }
            else if(total>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[2];
    }
}
