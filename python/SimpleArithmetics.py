import random
import time

first_number = random.randint(10,25)
second_number = random.randint(17,35)
result = first_number - second_number
number_of_success = 0
number_of_failure = 0

start_time = time.time()
for count in range (1):
    for counter in range (2):
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1
         

         
    print("Welcome to the second phase");
    for countt in range (2,4):
        first_number = random.randint(10,55)
        second_number = random.randint(20,60)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1
  
    print("Welcome to the third phase");
    for counti in range (4,6):
        first_number = random.randint(30,90)
        second_number = random.randint(20,24)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1



print("Welcome to the fourth phase");
for count in range (1):
    for countin in range (2):
        first_number = random.randint(16,56)
        second_number = random.randint(19,80)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1


         
    print("Welcome to the fifth phase");
    for counting in range (2,4):
        first_number = random.randint(10,85)
        second_number = random.randint(8,38)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1
  
    print("Welcome to the sixth phase");
    for counts in range (4,6):
        first_number = random.randint(15,26)
        second_number = random.randint(18,88)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1


print("Welcome to the seventh phase");
for count in range (1):
    for index in range (2):
        first_number = random.randint(12,44)
        second_number = random.randint(11,60)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1


         
    print("Welcome to the eight phase");
    for indexx in range (2,4):
        first_number = random.randint(40,88)
        second_number = random.randint(20,35)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1
  
    print("Welcome to the ninth phase");
    for number in range (4,6):
        first_number = random.randint(12,90)
        second_number = random.randint(15,30)
        result = first_number - second_number
        user_answer = int(input(f"Enter the result of {first_number} - {second_number} ")) 
        if user_answer == result:
            print("Correct Answer")
            number_of_success += 1
         
        else: 
            print("incorrect Answer \n")
            number_of_failure += 1


print(f"Your score is: {number_of_success}")
stop_time = time.time

total_time =  start_time - stop_time

print(f"Total time spent is {total_time/-1000} seconds")
  


