import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int new_guest = 0;
    int number_of_slice_1 = 4;
    int number_of_slice_2 = 6;
    int number_of_slice_3 = 8;
    int number_of_slice_4 = 12;
    int boxes = 0;
    int amount = 0;


String joint = "🛖️WELCOME TO IYA SCAMBIRA PIZZA JOINT🛖️";

String name = "WITH OUR PIZZA🍕️ YOUR CRAVINGS... TURNS TO FOODGASM😋️ ";
System.out.println(joint);
System.out.println(name);


System.out.println();

System.out.println("\t \t \tOUR MENU  ");

for (int count = 0; count < 10; count++){
    System.out.print("******");
    }
System.out.println();
for (int count = 0; count < 1; count++){
    System.out.print("| ");
    System.out.println("Pizza type \t |  Number of Slices\t |   Price per Box  |");
    System.out.println("-------------------------------------------------------------" );
    System.out.println("| Sapa Size \t |  4\t                 |   2,000          |");
    System.out.println("-------------------------------------------------------------" );
    System.out.println("| Small Money \t |  6\t                 |   2,400          |");
    System.out.println("-------------------------------------------------------------");
    System.out.println("| Big Boys \t |  8\t                 |   3,000          |");
    System.out.println("-------------------------------------------------------------");
    System.out.println("| Odogwu Parara  |  12\t                 |   4,200  \t    |" );
    System.out.println("*************************************************************");
}

String order_type = """
                What type of pizza would you love to order?
                    1. Sapa Size
                    2. Small Money (Shikini Money)🫰️
                    3. Big Boys (Olugbajie girls🥸️)
                    4. Odogwu Paran4ra(Nde weh obodo)🚙️🚗️🏎️💰️

                """;

System.out.println();
  
System.out.println(order_type);

System.out.println("Enter the number that suits your choice of pizza package: ");
            String guest = scanner.nextLine();
System.out.println("Enter the number of guest expected: ");
        int numberOfGuest = scanner.nextInt();
new_guest = Integer.parseInt (guest);


switch(new_guest){
    case 1: {
        for(int count = 0; count <= numberOfGuest; count++){
            if (count * number_of_slice_1 >= numberOfGuest ){
                boxes = count;
                break;
            }
        }
             
        amount = number_of_slice_1 * boxes;
            if (amount == numberOfGuest)        
                System.out.printf("you would buy %d of Sapa Size which is %d slices 🍕️", boxes, amount);
            else if (amount > numberOfGuest){
                System.out.printf("you would buy %d of Sapa Size which is %d slices 🍕️", boxes, amount);
                System.out.printf("The number of slices left after the oble is %d slices of 🍕️🤩️", amount - numberOfGuest);
            }
            }
        }


switch(new_guest){
    case 2: {
        for(int count = 0; count <= numberOfGuest; count++){
            if (count * number_of_slice_2 >= numberOfGuest ){
                boxes = count;
                break;
            }
        }
             
        amount = number_of_slice_2 * boxes;
            if (amount == numberOfGuest)        
                System.out.printf("you would buy %d of Shikini MONEY 🫰️ which is %d slices 🍕️", boxes, amount);
            else if (amount > numberOfGuest){
                System.out.printf("you would buy %d of Small Money which is %d slices 🍕️", boxes, amount);
                System.out.printf("The number of slices left after the oble is %d slices of Shikin Money Pizza🍕️🤩️", amount - numberOfGuest);
            }
            }
        }

switch(new_guest){
    case 3: {
        for(int count = 0; count <= numberOfGuest; count++){
            if (count * number_of_slice_3 >= numberOfGuest ){
                boxes = count;
                break;
            }
        }
             
        amount = number_of_slice_3 * boxes;
            if (amount == numberOfGuest)        
                System.out.printf("you would buy %d of Big Boys (Olugbajie girls🥸️) which is %d slices 🍕️", boxes, amount);
            else if (amount > numberOfGuest){
                System.out.printf("you would buy %d of Big Boys (Olugbajie girls🥸️) which is %d slices 🍕️", boxes, amount);
                System.out.printf("The number of slices left after the oble is %d slices of Big Boys (Olugbajie girls🥸️) Pizza🍕️🤩️", amount - numberOfGuest);
            }
            }
        }




switch(new_guest){
    case 4: {
        for(int count = 0; count <= numberOfGuest; count++){
            if (count * number_of_slice_4 >= numberOfGuest ){
                boxes = count;
                break;
            }
        }
             
        amount = number_of_slice_4 * boxes;
            if (amount == numberOfGuest)        
                System.out.printf("you would buy %d of Odogwu Parara(Nde weh obodo)🚙️🚗️🏎️💰️ which is %d slices 🍕️", boxes, amount);
            else if (amount > numberOfGuest){
                System.out.printf("you would buy %d of Odogwu Parara(Nde weh obodo)🚙️🚗️🏎️💰️ which is %d slices 🍕️", boxes, amount);
                System.out.printf("The number of slices left after the oble is %d slices of Odogwu Parara(Nde weh obodo)🚙️🚗️🏎️💰️ Pizza🍕️🤩️", amount - numberOfGuest);
            }
            }
        }



    }

}


