class Solution:
    def kClosest(self, points: list[list[int]], k: int) -> list[list[int]]:
        heap=[]
        for x, y in points:
            dist=x*x+y*y
            heapq.heappush(heap,(dist,[x,y]))
        result=[]
        for i in range(k):
            dist, point=heapq.heappop(heap)
            result.append(point)
        return result