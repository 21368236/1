class CashRegister :
# The classes for the cash resisters being defined.
 def __init__(self) :
  self._itemCount = 0
  self._totalPrice = 0.0
  self.getPounds =("£", totalPrice)

# A single item has been added to the register
 def addItem(self, price) :
  self._itemCount = self._itemCount + 1
  self._totalPrice = self._totalPrice + price

# Calculation of The total prices from the items
 def getTotal(self) :
  return self._totalPrice
 
# Calculation of the quanity of the items 
 def getCount(self) :
  return self._itemCount
# The program resets to zero.
 def clear(self) :
  self._itemCount = 0
  self._totalPrice = 0.0

 def giveChange(self, payment):
  self._payment = totalPrice - 




register1 = CashRegister()
register1.addItem(0.90)
register1.addItem(0.95)
register2 = CashRegister()
register2.addItem(1.90)
#CashRegister.getPounds =("£", totalPrice)


