
import kotlin.math.max

class Solution {
    fun longestSubarray(input: IntArray): Int {
        // Alternative: val maxValue = input.max()
        var maxValue = 0
        for (value in input) {
            maxValue = max(maxValue, value)
        }

        var maxSizeSubarrayWithMaxBitwiseAND = 0
        var currentSizeSubarrayWithMaxBitwiseAND = 0
        for (i in input.indices) {
            if (input[i] == maxValue) {
                ++currentSizeSubarrayWithMaxBitwiseAND
                maxSizeSubarrayWithMaxBitwiseAND =
                    Math.max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND)
            } else {
                currentSizeSubarrayWithMaxBitwiseAND = 0
            }
        }

        return maxSizeSubarrayWithMaxBitwiseAND
    }
}
