n=0
pi=0
while (n<16384):
    pi=pi+((((-1)**n)*4)/(2*n+1))
    n=n+1
    print(pi)
