class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var startIdx = 0
        var curIdx = 0
        var newIdx: Int
        var prev = nums[startIdx]
        var temp: Int
        val size = nums.size
        for (i in nums.indices){
            newIdx = (curIdx + (k%size))%size

            temp= nums[newIdx]
            nums[newIdx]=prev
            prev= temp
            curIdx = newIdx

            if(startIdx == newIdx){
                startIdx = (startIdx+1)%size
                prev = nums[startIdx]
                curIdx = startIdx
            }
        }
    }
}