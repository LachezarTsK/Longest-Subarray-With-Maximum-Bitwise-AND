
#include <vector>
#include <algorithm>
using namespace std;

/*
 The code will run faster with ios::sync_with_stdio(0).
 However, this should not be used in production code and interactive problems.
 In this particular problem, it is ok to apply ios::sync_with_stdio(0).

 Many of the top-ranked C++ solutions for time on leetcode apply this trick,
 so, for a fairer assessment of the time percentile of my code
 you could outcomment the lambda expression below for a faster run.
*/

/*
const static auto speedup = [] {
    ios::sync_with_stdio(0);
    return nullptr;
}();
*/

class Solution {
public:
    int longestSubarray(const vector<int>& input) const {
        // Alternative: int maxValue = *ranges::max_element(input);
        // requires: #include <ranges>
        int maxValue = 0;
        for (const auto& value : input) {
            maxValue = max(maxValue, value);
        }

        int maxSizeSubarrayWithMaxBitwiseAND = 0;
        int currentSizeSubarrayWithMaxBitwiseAND = 0;
        for (size_t i = 0; i < input.size(); ++i) {
            if (input[i] == maxValue) {
                ++currentSizeSubarrayWithMaxBitwiseAND;
                maxSizeSubarrayWithMaxBitwiseAND = max(maxSizeSubarrayWithMaxBitwiseAND, currentSizeSubarrayWithMaxBitwiseAND);
            }
            else {
                currentSizeSubarrayWithMaxBitwiseAND = 0;
            }
        }

        return maxSizeSubarrayWithMaxBitwiseAND;
    }
};
