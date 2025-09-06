a=int(input("Enter Your Choice :"))
factor=0
for i in range(1,a):
    if a%i==0:
        factor=factor+i
if factor==a:
    print("Perfect No.")   
else:
    print("Not Perfect")         