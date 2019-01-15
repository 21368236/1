import time

for x in range(0,256) :
 randomTime = time.time()
 print  (randomTime)
 randomSeed = randomTime % 1
 print(randomSeed)
 randomSeed = int (randomSeed * 10000)
 print (randomSeed)
