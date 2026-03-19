package Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int idx=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[idx]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
            else i++;
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1) return k+1;
        }
        return nums.length+1;
    }
}
