#Program to find dot product or cross product of two 3-dimensional vectors

print("Hello! This a program to find either the dot product or cross product of \
      two 3-dimensional vectors:")

#First vector
i1 = int(input("Enter the value of x for your first vector: "))
j1 = int(input("Enter the value of y for your first vector: "))
k1 = int(input("Enter the value of z for your first vector: "))
vector1 = "(" + str(i1) + ", " + str(j1) + ", " + str(k1) + ")"
print("")
#Second vector
i2 = int(input("Enter the value of x for your second vector: "))
j2 = int(input("Enter the value of y for your second vector: "))
k2 = int(input("Enter the value of z for your second vector: "))
vector2 = "(" + str(i2) + ", " + str(j2) + ", " + str(k2) + ")"

print("Your two vectors are")

print(vector1, "and",vector2)
print("Do you want to find the dot product or the cross product of these vectors?")

while True:
    user_input = input("[dot]/[cross]?: ")
    if (user_input == "dot"):
        dot_product = i1*i2 + j1*j2 + k1*k2
        print(vector1,".",vector2,"=",dot_product)
        break #exits loop
    elif (user_input == "cross"):
        i = (j1*k2-k1*j2)
        j = (i1*k2-k1*i2)
        j = -j
        k = (i1*j2-j1*i2)
        cross_product = "(" + str(i) + ", " + str(j) + ", " + str(k) + ")"
        print(vector1,"x",vector2,"==",cross_product)
        break #exits loop
    else:
        print("Sorry, the program did not see you enter 'dot' or 'cross'")
        print("Try again")
        continue #goes back to while loop






