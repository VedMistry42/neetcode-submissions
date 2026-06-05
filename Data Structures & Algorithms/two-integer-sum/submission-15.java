class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable <Integer,Integer> set = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(set.containsKey(val)){
                return new int [] {set.get(val),i};
            }
            set.put(target-val,i);
        }
        return new int[2];
    }
}
