public class DP121
{
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else
            {
                int s = prices[i] - min;
                if (s > profit) {
                    profit = s;
                }
            }
        }
        return profit;
    }
}
