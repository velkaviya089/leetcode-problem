class Solution:
    def countPrimes(self, n: int) -> int:
        if n<3:
            return 0
        is_prime=[True]*n
        is_prime[0]=is_prime[1]=False
        for i in range(2,int(n**0.5)+1):
            if is_prime[i]:
                for j in range(i*i,n,i):
                    is_prime[j]=False
        return sum(is_prime)
        # count=0
        # for num in range(2,n):
        # is_prime=True
        # for i in range(2,int(num**0.5)+1):
        #     if num%i==0:
        #         is_prime=False
        #         break
        #     if is_prime:
        #         count+=1
        # return count
        