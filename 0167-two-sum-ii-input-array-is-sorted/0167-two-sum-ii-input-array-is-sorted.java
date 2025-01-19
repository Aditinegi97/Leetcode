class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = nums.length;
        for (int i= 0; i < nums.length; i++ ){
            for(int j = i+1 ; j<nums.length; j++){
                if ( nums[i] + nums[j] == target ){
                    return new int[]{i+1,j+1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}