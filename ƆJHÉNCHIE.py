class Jhénchee():
    #konstruktor
    def __init__(self, name="!uritaras", age=118, gender="F"):
        self.name=name
        self.age=age
        self.gender=gender

    def displayDetails(self):
        print("Name\t", self.name)
        print("Age\t", self.age)
        print("Gender\t", self.gender)
