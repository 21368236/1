import random

#Generate a random number...
number =random.randint(1,100)
print("guess a number betwixt 0 &100")

guess = -1
while guess != number:
    guess = int(input("Enter the guess...")

    if guess == number:
    #Prompt the user...
        print ("correct. The number is" + number)
    elif  guess> number:
        print("the correct answer was lower than that.")
    else:
        print ("The correct answer was above that.")
