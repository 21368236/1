list1 = ("!uritaras", "mankumfo")
print (list1)
list1.add (8889)
print (list1)

#PRIMITIVE VS COMPLEX
class EmptyObj():
 def __init__(self):
  pass
 def add (self, x, y):
  result = x + y
  return result

calculator = EmptyObj()
calc = calculator.add(5, 6)
print(calculator.result)
