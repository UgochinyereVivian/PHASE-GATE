
            cardNumber = input("Enter your card number");
            card = long(cardNumber);
            newArray = [0] * len(cardNumber);


    for count in range newArray.length; count++){
        number = card % 10;
        newArray[count] = number;
        number = card /= 10;
        
    } 
 

    for(int counter = 1; counter < newArray.length; counter+=2){
        multiply = newArray[counter] * 2;
        
            if(multiply > 9){
                for(int count = 0; count < 2; count++){
                store += multiply % 10;
                multiply /= 10;
            }
                }
         sum += multiply;
         
        }
     newSum +=  sum + store;

 
 
    for(int index = 0; index < newArray.length; index+=2){
        multiple += newArray[index];     
        }


    total += newSum + multiple;



    System.out.printf("Credit Card Number: %s \n",cardNumber);
    System.out.printf("Credit Card Length: %d \n", cardNumber.length());
    if(total % 10 == 0)
        System.out.println("Credit Card Validity Status: valid");
    else  System.out.println("Credit Card Validity Status: invalid");
    
    




}


}
