for _ in range(int(input())):
    n = int(input())
    ans = 0
    for i in range(n):
        p,q,d = list(map(int,input().split()))
        p1 = p + p*d/100
        s = p1 - p1*d/100
        l = p-s
        ans += l*q
    print(ans)
        
