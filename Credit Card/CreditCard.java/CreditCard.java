import java.util.Arrays;
import java.util.Scanner;

public class CreditCard{
    public static void main(String[]args){
        long number = 0;
        int sum = 0;
        long multiply = 0;
        int store = 0;
        long multiple = 0;
        int storage = 0;
        int odd_sum = 0;
        int newSum = 0;
        int total = 0;

        Scanner collector = new Scanner(System.in);
        System.out.println("Enter your card number");
            String cardNumber = collector.nextLine();
            long card = Long.parseLong(cardNumber);
            long [] newArray = new long [cardNumber.length()];


    for(int count = 0; count < newArray.length; count++){
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
