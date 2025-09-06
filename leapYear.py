y=int(input("Enter Your Year : "))
if y%100==0 and y%400==0:
    print("Leapyear")
elif y%4==0:
    print("Leapyear")
else:
    print("Not Leapyear")        