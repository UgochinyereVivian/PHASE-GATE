import time

joint = "🛖️WELCOME TO IYA SCAMBIRA PIZZA JOINT🛖️ \n"
name = "WITH OUR PIZZA🍕️ YOUR CRAVINGS... TURNS TO FOODGASM😋️ "

number_of_slice_1 = 4
number_of_slice_2 = 6
number_of_slice_3 = 8
number_of_slice_4 = 12

for char in joint:
    print(" ", end="")
    print(char,end='')
    time.sleep(0.1)
   

for num in range(1,5):
    print('*',end='')
    time.sleep(1)
    print("**", end='')

for char in name:
    print(char, end="")


for num in range(1,5):
    print('*',end='')
    time.sleep(1)
    print("**", end='')

print("\n \n")

print ("\t \t \tOUR MENU  ")

for asteiks in range (7):
    print("**"*4, end="")
    
print()
for asteiks in range (1):
    print("| ", end="")
    print("Pizza type \t |",  "Number of Slices\t | ",  "Price per Box  |")
    print("------" * 10)
    print("| Sapa Size \t |",  "4\t                 | ",  "2,000          |")
    print("------" * 10)
    print("| Small Money \t |",  "6\t                 | ",  "2,400          |")
    print("------" * 10)
    print("| Big Boys \t |",  "8\t                 | ",  "3,000          |")
    print("------" * 10)
    print("| Odogwu Parara  |",  "12\t                 | ",  "4,200  \t   |")
    print("*"*60)

order_type = '''What type of pizza would you love to order?
                    1. Sapa Size
                    2. Small Money (Shikini Money)
                    3. Big Boys (Olugbajie girls🥸️)
                    4. Odogwu Parara(Nde weh obodo)🚙️🚗️🏎️💰️

                '''
print()  
print(order_type)
choice = int (input("Enter the number that suits your choice of pizza package: "))
guest = input("Enter the number of guest expected: ")
new_guest = int(guest)


match choice:
    case 1: 
        for number in range(new_guest): #what if it requires a range more than 10
            if number * number_of_slice_1 >= new_guest:
                boxes = number
                break 
               
        amount = number_of_slice_1 * boxes
        if amount == new_guest:         
            print(f"you would buy {boxes} of Sapa Size which is {amount} slices 🍕️")
        elif amount > new_guest:  
            print(f"you would buy {boxes} of Sapa Size which is {amount} slices 🍕️")
            print(f"The number of slices left after the oble is\
 {amount-new_guest} slices of 🍕️🤩️")

    case 2: 
        for number in range(new_guest): 
            if number * number_of_slice_2 >= new_guest:
                boxes = number
                break 
               
        amount = number_of_slice_2 * boxes
        if amount == new_guest:         
            print(f"you would buy {boxes} of Small Money Size which is {amount} slices 🍕️")
        elif amount > new_guest:  
            print(f"you would buy {boxes} of Small Money Size which is {amount} slices 🍕️")
            print(f"The number of slices left after the oble is\
 {amount-new_guest} slices of Shikini Money PIzza🍕️🤩️")

    case 3: 
        for number in range(new_guest): 
            if number * number_of_slice_3 >= new_guest:
                boxes = number
                break 
               
        amount = number_of_slice_3 * boxes
        if amount == new_guest:         
            print(f"you would buy {boxes} of Big Boys (Olugbajie girls🥸️) Size which is {amount} slices 🍕️")
        elif amount > new_guest: 
            print(f"you would buy {boxes} of Big Boys Size which is {amount} slices 🍕️")
            print(f"The number of slices left after the oble is\
 {amount-new_guest} slices of Big Bro's PIzza🍕️🤩️")

    case 4: 
        for number in range(new_guest): 
            if number * number_of_slice_4 >= new_guest:
                boxes = number
                break 
               
        amount = number_of_slice_4 * boxes
        if amount == new_guest:         
            print(f"you would buy {boxes} of Odogwu Parara(Nde weh obodo)🚙️🚗️🏎️💰️ Size which is {amount} slices 🍕️")
        elif amount > new_guest: 
            print(f"you would buy {boxes} of Odogwu Pararan🚙️🚗️🏎️💰️ Size which is {amount} slices 🍕️")
            print(f"The number of slices left after the oble is\
 {amount-new_guest} slices of Ndi weh obodo🚙️🚗️🏎️💰️ PIzza🍕️🤩️")




