class Solution {
    fun hIndex(citations: IntArray): Int {
        var n = citations.size
        citations.sortDescending()
        var hIdx = 0
        for (i in citations.indices) {
            if (citations[i] >= i+1) {
                hIdx++
            }else{
                break
            }
        }
        return hIdx
    }
}