class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = {}
        for ch in s:
            count[ch] = count.get(ch,0) + 1
        length = 0
        odd = False
        for value in count.values():
            if value % 2 ==0:
                length += value
            else:
                length += value-1
                odd=True
        if odd:
            length += 1
        return length
        