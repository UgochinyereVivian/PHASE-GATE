import java.util.Scanner;
import java.util.Arrays;

public class GroceryList{
    public static void main(String...args){
       
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                        This is your grocery cart
                        where you keep track of all the packages that you 
                        List the grocery items you want to add to your cart
                        press:
                        1. To add item
                        2. To remove item
                        3. To show availaible items
                         0.to exit
                         """);

      
        String Choice = scanner.nextLine();
        int newChoice = Integer.parseInt(Choice);

        String[] list = new String [10];
        


switch(newChoice){

     case 1:{System.out.println("Enter the number of item you may want to add");
            int noItems = scanner.nextInt();
            System.out.println("Enter the item you may want to add");
            for(int count = 0; count < noItems; count++){
             while (index < noItems){
                String item = scanner.nextLine();
                list[index] = item;
                index++;
             }}
            System.out.println("grocery list is: " + Arrays.toString(list));

    }

//    case 3: System.out.println(list);
             


    


}
     

}
}




