class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable <Integer, Boolean> set = new Hashtable<>();
        for(int i:nums){
            if(set.containsKey(i)){
                return true;
            }
            set.put(i,true);
        }
        return false;
    }
}