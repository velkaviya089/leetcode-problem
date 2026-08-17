class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        prefix_sum=0
        sum_freq={0:1}
        for num in nums:
            prefix_sum+=num
            count+=sum_freq.get(prefix_sum - k,0)
            sum_freq[prefix_sum]=sum_freq.get(prefix_sum,0)+1
        return count
        