n = 0
pi = 0
piOld= 1
while(abs(pi-piOld<0.001):
    piOld = pi
    pi +=( ( (-1)**n * 4)/(2 * n + 1) )
    n += 1
print("n is ", n, "pi is circa ", pi)
