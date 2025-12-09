


print("This is your grocery cart \
where you keep track of all the packages that you need")

users_list = int(input("""List the grocery items you want to add to your cart\
press:
1. To add item and display entire grocery list
2. To remove item
 0.to exit
 """))

users_cart = []




match users_list:
        case 1:
#            new =  int(input("2 to braek"))
#            while(new != 2): 
            index = 0 
            number_of_items = int(input("Enter the number of items you may want to add to your cart:"))
            while (index <= number_of_items):
                item = input("Enter the items you may want to add to your cart: ")
                users_cart.append(item)
                index += 1
            print("\n") 
            for items in users_cart:
                print(f"your items are: {item}")
            print(f"your grocery list is:\n {users_cart}")

        case 2:
            count = 0
            number_of_removal = int(input("how many items do you want to remove: "))
            while(count <= number_of_removal):
                item_to_remove = input("Enter the one item you may want to remove to your cart: ")
                users_cart.remove(users_cart[ item_to_remove])
           
          
          
          
           
            


