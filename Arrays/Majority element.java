package Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0],vote=1;
        for(int i=1;i<nums.length;i++){
            if(vote==0) candidate=nums[i];
            if(nums[i]==candidate) vote++;
            else vote--;
        }
        return candidate;
    }
}