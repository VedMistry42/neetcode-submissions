class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        PriorityQueue <Integer> pq = new PriorityQueue <> ((a,b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}
