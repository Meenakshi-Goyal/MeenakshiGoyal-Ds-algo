n=int(input())
for i in range(0,n):
    m=int(input())
    l=list(map(int,input().split()))
    while(len(l)>=3):
        p=l[0:3]
        p.sort()
        l.remove(p[1])
    for i in l:
        print(i,end=' ')
    print()
