class Solution {
    public boolean canJump(int[] nums) {
        int finalPOS = nums.length -1 ;
        for(int idx = nums.length-2 ; idx >= 0; idx--){
            if(idx + nums[idx] == finalPOS)
            {
                finalPOS = idx;
            }
        }
        return finalPOS == 0;
    }
}