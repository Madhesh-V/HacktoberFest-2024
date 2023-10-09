
print("The Petrol Calculator")

petrol=float(input("What is the current price of petrol? "))
amount=float(input("How many kilometers do you get to one litre of petrol "))
kilo=float(input("How many kilometers did you travel today? "))

print("Your petrol cost for your travel today is: ", (kilo/amount)*petrol)
               
