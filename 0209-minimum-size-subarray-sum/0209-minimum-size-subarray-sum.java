class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE; // To store the minimum length
        int windowSum = 0;                 // To keep track of the current window sum
        int left = 0;                      // Left pointer of the sliding window

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];      // Add the current element to the window sum

            // Shrink the window as much as possible while the sum is >= target
            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1); // Update the minimum length
                windowSum -= nums[left];                          // Shrink the window from the left
                left++;
            }
        }

        // If no valid subarray was found, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
