class Solution {
    fun hIndex(citations: IntArray): Int {
            citations.sortDescending()
            var hIndex = 0
            for (i in citations.indices) {
                if (citations[i] >= i+1) ++hIndex
                else break
            }
            return hIndex
        }
}