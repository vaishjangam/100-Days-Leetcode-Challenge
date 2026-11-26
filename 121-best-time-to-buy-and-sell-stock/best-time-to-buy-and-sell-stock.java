class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }

            profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit); 
        }

        return maxProfit;
    }
}