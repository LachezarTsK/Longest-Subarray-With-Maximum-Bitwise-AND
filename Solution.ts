
function longestSubarray(input: number[]): number {
    // Alternative: let maxValue = Math.max(...input);
    let maxValue = 0;
    for (let value of input) {
        maxValue = Math.max(maxValue, value);
    }

    let maxSizeSubarrayWithMaxBitwiseAND = 0;
    let currentSizeSubarrayWithMaxBitwiseAND = 0;
    for (let i = 0; i < input.length; ++i) {
        if (input[i] === maxValue) {
            ++currentSizeSubarrayWithMaxBitwiseAND;
            maxSizeSubarrayWithMaxBitwiseAND = Math.max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND);
        } else {
            currentSizeSubarrayWithMaxBitwiseAND = 0;
        }
    }

    return maxSizeSubarrayWithMaxBitwiseAND;
};
