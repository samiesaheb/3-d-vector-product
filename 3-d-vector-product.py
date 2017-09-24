#Program to find the dot/cross product of two 3-d vectors
v1 = [] #First vector
v2 = [] #Second vector
v3 = [] #Third vector
print("This is a program to find the dot/cross product of two 3-d vectors")
print("")

print("Enter coordinates of the first vector:")
for n in range(3):
    v1.append(int(input()))
print("First vector:",v1)
print("")

print("Enter coordinates of the second vector:")
for n in range(3):
    v2.append(int(input()))
print("Second vector:",v2)
print("")

print("Do you want to find the dot product ('d') or the cross product ('c') ?")

while True:
    user_input = input()
    if (user_input == "d"):
        dot_product = v1[0]*v2[0] + v1[1]*v2[1] + v1[2]*v2[2]
        print(v1,".",v2,"==",dot_product)
        break #Exits loop
    elif (user_input == "c"):
        i = (v1[1]*v2[2] - v1[2]*v2[1])
        j = (v1[0]*v2[2] - v1[2]*v2[0])
        j = -j
        k = (v1[0]*v2[1] - v1[1]*v2[0])
        v3.append(i)
        v3.append(j)
        v3.append(k)
        print(v1,"x",v2,"==",v3)
        break #Exits loop
    else:
        print("Sorry, the program did not see you enter 'd' or 'c'")
        print("Try again")
        continue #Goes back to while loop
