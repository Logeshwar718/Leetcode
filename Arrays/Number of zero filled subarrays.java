package Arrays;
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                res+=count;
            }
            else{
                count=0;
            }
        }
        return res;
    }
}
