#seed = int(input(“SEED?: ”))
import time
randomTime = time.time()
seed = randomTime % 1
seed = int(seed * 10000)
print("SEED:", seed, "!")
for x in range(0,20):
 seedSquared = seed ** 2
#print (“SQUARED: ”, seedSquared)
 random = seedSquared // 100
 random = random % 10000
 print ("Random number: %d (from %d)", seedSquared, seed)
