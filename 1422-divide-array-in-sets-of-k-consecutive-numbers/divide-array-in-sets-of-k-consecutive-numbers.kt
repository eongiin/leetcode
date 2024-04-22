class Solution {
    fun isPossibleDivide(nums: IntArray, k: Int): Boolean {

        if (nums.size % k != 0) return false
        
        var map = HashMap<Int, Int>()
        for (i in nums) {
            map[i] = map.getOrDefault(i, 0) + 1
        }


        while (map.isNotEmpty()) {
            val key = map.keys.minOrNull() ?: return false
            for (i in 0 until k) {
                val nextKey = key + i
                if (map.containsKey(nextKey)) {
                    map[nextKey] = map[nextKey]!! - 1
                    if (map[nextKey] == 0) {
                        map.remove(nextKey)
                    }
                } else {
                    return false
                }
            }
        }

        return true
    }
}