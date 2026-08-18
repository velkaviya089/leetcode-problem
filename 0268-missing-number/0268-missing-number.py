class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # n=len(nums)
        # total=n*(n+1)//2
        # return total - sum(nums)
        i=0
        n=len(nums)
        while i<n:
            correct_pos=nums[i]
            if correct_pos<n and nums[i]!=nums[correct_pos]:
                nums[i],nums[correct_pos]=nums[correct_pos],nums[i]
            else:
                i+=1
        for i in range(n):
            if nums[i]!=i:
                return i
        return n
        
        