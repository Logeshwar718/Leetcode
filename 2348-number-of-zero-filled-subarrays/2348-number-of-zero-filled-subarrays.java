class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count++;
            else count=0;
            res+=count;
        }
        return res;
    }
}