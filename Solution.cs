
using System;

public class Solution
{
    public int LongestSubarray(int[] input)
    {
        // Alternative: int maxValue =  input.Max();
        int maxValue = 0;
        foreach (int value in input)
        {
            maxValue = Math.Max(maxValue, value);
        }

        int maxSizeSubarrayWithMaxBitwiseAND = 0;
        int currentSizeSubarrayWithMaxBitwiseAND = 0;
        for (int i = 0; i < input.Length; ++i)
        {
            if (input[i] == maxValue)
            {
                ++currentSizeSubarrayWithMaxBitwiseAND;
                maxSizeSubarrayWithMaxBitwiseAND = Math.Max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND);
            }
            else
            {
                currentSizeSubarrayWithMaxBitwiseAND = 0;
            }
        }

        return maxSizeSubarrayWithMaxBitwiseAND;
    }
}
