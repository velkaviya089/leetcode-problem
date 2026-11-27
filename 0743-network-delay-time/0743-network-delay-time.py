class Solution:
    def networkDelayTime(self, times: list[list[int]], n: int, k: int) -> int:
        graph=defaultdict(list)
        for u,v, w in times:
            graph[u].append((v,w))
        dist={}
        pq=[(0,k)]
        while pq:
            time,node=heapq.heappop(pq)
            if node in dist:
                continue
            dist[node]=time
            for nei, weight in graph[node]:
                if nei not in dist:
                    heapq.heappush(pq,(time+weight,nei))
        if len(dist)==n:
            return max(dist.values())
        return -1