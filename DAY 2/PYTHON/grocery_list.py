


print("This is your grocery cart \
where you keep track of all the packages that you need")

users_list = int(input("""List the grocery items you want to add to your cart\
press:
1. To add item
2. To remove item
3. To show availaible items
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
                   
            print(users_cart)

        case 2:
            count = 0
            number_of_removal = int(input("how many items do you want to remove: "))
            while(count <= number_of_removal):
                item_to_remove = input("Enter the one item you may want to remove to your cart: ")
                users_cart.remove(user_cart[0])
            
            print(users_cart)
        case 3:
           print(f"your grocery list is:\n {users_cart}")
          
          
          
           
            

#            new_users_list = {users_list}
#            print(new_users_list)
#        users_list = input("add more(optional): ")
