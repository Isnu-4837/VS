a=int(input("Enter Your Choice :"))
odd=0
even=0
for i in range(a+1):
    if(i%2==0):
        even=even+i
    else:
        odd=odd+i    
print(f"Odd = {odd}")   
print(f"Even = {even}")        