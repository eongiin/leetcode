class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var totalGas = 0
        var curGas = 0
        var startIdx = 0

        for (idx in gas.indices){
            var diff = gas[idx]-cost[idx]
            totalGas += diff
            curGas += diff
            
            if(curGas<0){
                curGas = 0
                startIdx=idx+1
            }
        }
        
        if(totalGas < 0){
            return -1
        }

        return startIdx
    }
}