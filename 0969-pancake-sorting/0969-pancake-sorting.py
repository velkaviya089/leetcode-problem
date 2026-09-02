class Solution:
    def pancakeSort(self, arr: List[int]) -> List[int]:
        ans=[]
        for size in range(len(arr),1,-1):
            max_idx=arr.index(max(arr[:size]))
            if max_idx == size - 1:
                continue
            if max_idx!=0:
                arr[:max_idx+1]=arr[:max_idx+1][::-1]
                ans.append(max_idx+1)
            arr[:size]=arr[:size][::-1]
            ans.append(size)
        return ans