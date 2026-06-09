class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,maxProfit=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            profit=prices[i]-min;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}