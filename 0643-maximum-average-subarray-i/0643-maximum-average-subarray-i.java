class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cursum =0;
        double maxavg;

    for(int i = 0;i< k; i++){
        cursum += nums[i];
        }
        int maxsum = cursum;
        int startIndex = 0;
        int lastIndex = k; 
        
        for( lastIndex = k; lastIndex < nums.length;lastIndex++)
        {

        cursum -= nums[startIndex];
        startIndex++;

        cursum += nums[lastIndex];
        lastIndex++;
        
        maxsum = Math.max(maxsum,cursum);
        
        }


        maxavg = (double) maxsum/k;
        return maxavg;
    }
}