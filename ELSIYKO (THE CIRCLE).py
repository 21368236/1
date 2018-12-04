import math
class Circle():
    def __init__(self, radius =1):
        self.radius = radius

    def getPerimeter(self):
        return 2 * self.radius * math.pi

    def getArea(self):
        return self.radius * self.radius * math.pi
from circle import circle

def main():
    circle1 = Circle(1)
    print("The area of the circle of radius", circle1.radius, "is", circle1. getArea())

    circle2 = Circle(25)
    print("The area of the circle of radius", circle1.radius, "is{:.2f}".format(circle2. getArea()))
main()
