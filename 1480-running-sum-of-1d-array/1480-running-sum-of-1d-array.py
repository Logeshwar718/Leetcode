class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        curr=nums[0]
        result=[nums[0]]
        for i in range(1,len(nums)):
            curr+=nums[i]
            result.append(curr)
        return result