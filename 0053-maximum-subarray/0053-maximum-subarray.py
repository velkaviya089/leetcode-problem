class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        current_sum=nums[0]
        max_sum=nums[0]
        for i in range(1,len(nums)):
            current_sum=max(nums[i],current_sum +nums[i])
            max_sum=max(max_sum,current_sum)
        return max_sum     
        




# int maxsum=integer.MIN_VALUE;
# for (i=0;i<n; i++) {
#     int current sum=0;
#     for (j=i;j<n;j++){
#         currentSum+=nums[i];
#         if(currentSum>maxSum){
#             maxSum=currentSum;}
#         if(currentSum<0){
#             currentSum=0;}
#     }
# }
#     return maxSum;
