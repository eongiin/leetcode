class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }
        return map.maxByOrNull { it.value }!!.key
    }
}