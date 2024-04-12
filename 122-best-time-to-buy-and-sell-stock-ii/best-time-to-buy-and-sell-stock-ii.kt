class Solution {
    fun maxProfit(prices: IntArray): Int {
        var answer = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                answer += prices[i] - prices[i - 1]
            }
        }
        return answer
    }
}