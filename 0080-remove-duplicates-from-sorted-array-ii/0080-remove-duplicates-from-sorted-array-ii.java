class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 0;
        for (int n : nums)
        {
            if(ind < 2 || n!= nums[ind-2] )
            {
                nums[ind++] = n; 

            }
        }
    return ind;
    }
}
