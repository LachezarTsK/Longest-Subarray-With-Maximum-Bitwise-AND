
package main

import "fmt"

func longestSubarray(input []int) int {
    // Alternative: maxValue := slices.Max(input)
    // requires: import "slices"
    maxValue := 0
    for _, value := range input {
        maxValue = max(maxValue, value)
    }

    maxSizeSubarrayWithMaxBitwiseAND := 0
    currentSizeSubarrayWithMaxBitwiseAND := 0
    for i := range input {
        if input[i] == maxValue {
            currentSizeSubarrayWithMaxBitwiseAND++
            maxSizeSubarrayWithMaxBitwiseAND = max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND)
        } else {
            currentSizeSubarrayWithMaxBitwiseAND = 0
        }
    }

    return maxSizeSubarrayWithMaxBitwiseAND
}
