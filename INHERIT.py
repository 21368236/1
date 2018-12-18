class A():
 data = "a"
 def inA(self):
  print ("inA called")
 def Z (self):
  print ("Z CALLED IN A")
 def ǂ (self):
  self.Z()
class B(A):
 data = "B"
 def inA(self):
  print ("inA called")
 def Z (self):
  print ("Z CALLED IN B")
 def ǂ (self):
  self.inA ()
  self.Z ()

#
newA.inA
#
newB.inA
