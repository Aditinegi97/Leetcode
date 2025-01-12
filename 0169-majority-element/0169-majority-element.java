class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int least = -1;
        for (int i=0;i<nums.length;i++){
            if(count == 0){
                least=nums[i];
            }
            if(nums[i]== least){
                count++;
            }

            else{
                count--;
            }
        }
        return least;
    }
}