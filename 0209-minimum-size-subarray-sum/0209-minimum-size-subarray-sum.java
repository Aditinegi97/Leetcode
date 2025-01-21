class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int windowsum = 0;
        int left = 0;

        for (int r = 0; r<nums.length; r++){
            windowsum = windowsum+nums[r];
            while(windowsum >= target)
            {
            min = Math.min(min, r - left +1);
            windowsum = windowsum - nums[left];
            left++;
            }
        }
        if(min == Integer.MAX_VALUE)
        return 0 ;
        else
        return min;
    }
}