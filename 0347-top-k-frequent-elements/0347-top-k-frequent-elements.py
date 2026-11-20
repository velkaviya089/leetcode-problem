class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        
        count=Counter(nums)
        heap=[]
        for num, freq in count.items():
            heapq.heappush(heap,(-freq,num))
        result=[]
        for i in range(k):
            freq,num=heapq.heappop(heap)
            result.append(num)
        return result
        

        