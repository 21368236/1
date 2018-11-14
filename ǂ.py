sourceAsString = "rrRRRRRrrrrrrrrr 1 2 3 4 5 6 RRRRRrrrrrrrr RRRrrrrrrrrrrr"
sourceAsList = sourceAsString.split(" ")
print("Original string", sourceAsString)
print("String in list", sourceAsList)
for a in sourceAsList:
    print(a)

index=0
for index in range(3):
    print("index: ", index, " - ", sourceAsList[index])
    index += 1
