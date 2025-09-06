t=int(input("Enter Temperature (in celsius):"))
if t<0:
    print("Breezing Cold")
elif t>0 and t<=10:
    print("Very Cold")
elif t>10 and t<=20:
    print("Cold")
elif t>20 and t<=30:
    print("Pleasent")
elif t>30 and t<=40:
    print("Hot")
elif t>40:
    print("Very Hot")   
else:
    print("Error")     
                    