class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = prices[0];
        for(int i=0; i<prices.length;i++){
            int curr = prices[i];
            minPrice = Math.min(minPrice,curr);
            max = Math.max(max, curr-minPrice);
        } 
        return max;
    }
}
