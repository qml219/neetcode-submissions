class Solution {
    public int maxProfit(int[] prices) {
        int last_buy_price = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (price - last_buy_price < 0) {
                last_buy_price = price;
            } else {
                profit = Math.max(profit, price - last_buy_price);
            }
        }
        return profit;
    }
}
