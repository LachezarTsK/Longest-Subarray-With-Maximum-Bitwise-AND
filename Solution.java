
public class Solution {

    public int longestSubarray(int[] input) {
        // Alternative: int maxValue = Arrays.stream(input).max().getAsInt();
        // requires: import java.util.Arrays;
        int maxValue = 0;
        for (int value : input) {
            maxValue = Math.max(maxValue, value);
        }

        int maxSizeSubarrayWithMaxBitwiseAND = 0;
        int currentSizeSubarrayWithMaxBitwiseAND = 0;
        for (int i = 0; i < input.length; ++i) {
            if (input[i] == maxValue) {
                ++currentSizeSubarrayWithMaxBitwiseAND;
                maxSizeSubarrayWithMaxBitwiseAND = Math.max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND);
            } else {
                currentSizeSubarrayWithMaxBitwiseAND = 0;
            }
        }

        return maxSizeSubarrayWithMaxBitwiseAND;
    }
}
