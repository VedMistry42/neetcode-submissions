class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> output = new ArrayList<>();
        int i=0;
        while(i<len-2){
            int l = i+1;
            int r = len-1;
            int point = nums[i];
            if(point>0){
                break;
            }
            while(l<r){
                int left = nums[l];
                int right = nums[r];
                int sum = point+left+right;
                if(sum==0){
                    List<Integer> triplet = List.of(nums[i],nums[l],nums[r]);
                    output.add(triplet);
                    l++;
                    r--;
                    while (r>1 && nums[r]==right){
                        r--;
                    }
                    while(l<len-1 && nums[l]==left){
                        l++;
                    }
                }
                while (sum>0 && nums[r]==right && r>0){
                    r--;
                }
                while(sum<0 && nums[l]==left && l<len){
                    l++;
                }
            }
            while(i<len-2 && nums[i]==point){
                i++;
            }
        }
        return output;
    }
}
