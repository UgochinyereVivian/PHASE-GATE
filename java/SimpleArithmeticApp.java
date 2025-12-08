import java.util.Scanner;

public class SimpleArithmeticApp{
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        int firstNumber = (int)(Math.random()+30);
        int secondNumber = (int)(Math.random()+20);
        int result = firstNumber - secondNumber;
        int userAnswer = 0;
        int numberOfSucess = 0;
        int numberOfFailure = 0;
        int totalTime = 0;
    
int timeStart = (int)System.currentTimeMillis();

for  (int count = 0; count <= 2; count++){
    
        for(int counter = 0; count < 2; count++){
        System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
        userAnswer = scanner.nextInt();

         if(userAnswer == result){
            System.out.println("Correct Answer");
            numberOfSucess += 1;
         }
         else {
            System.out.println("incorrect Answer \n");
            numberOfFailure += 1;
         }
}
         
         System.out.println("Welcome to the second phase");
         for(int counti = 2; counti < 4; counti++){
            firstNumber = (int)(Math.random()*50);
            secondNumber = (int)(Math.random()*30); 
            result = firstNumber - secondNumber;
            System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber);  
             userAnswer = scanner.nextInt();
                
                
               
                 
                if(userAnswer == result){
                    System.out.println("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }


         System.out.println("Welcome to the third phase");
         for(int countin = 4; countin < 6; countin ++){
             firstNumber = (int)(Math.random()*80);
             secondNumber = (int)(Math.random()*30);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();
               
                if(userAnswer == result){
                    System.out.println("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }

}



System.out.println("Welcome to the fourth phase");
for  (int count = 0; count <= 2; count++){
    
        for(int counter = 0; count < 2; count++){
             firstNumber = (int)(Math.random()*1000);
             secondNumber = (int)(Math.random()*30);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();

         if(userAnswer == result){
            System.out.println("Correct Answer");
            numberOfSucess += 1;
         }
         else {
            System.out.println("incorrect Answer \n");
            numberOfFailure += 1;
         }
}
         
         System.out.println("Welcome to the fifth phase");
         for(int counti = 2; counti < 4; counti++){
             firstNumber = (int)(Math.random()*90);
             secondNumber = (int)(Math.random()*30);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();
               
                 
                if(userAnswer == result){
                    numberOfSucess += 1;
                    System.out.println("Correct Answer");
                    
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }


         System.out.println("Welcome to the sixth phase");
         for(int countin = 4; countin < 6; countin ++){
             firstNumber = (int)(Math.random()*300);
             secondNumber = (int)(Math.random()*30);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();
               
                 
                if(userAnswer == result){
                    System.out.println("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }

}



System.out.println("Welcome to the seventh phase");
for  (int count = 0; count <= 2; count++){
    
        for(int counter = 0; count < 2; count++){
             firstNumber = (int)(Math.random()*30);
             secondNumber = (int)(Math.random()*10);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();

         if(userAnswer == result){
            System.out.println("Correct Answer");
            numberOfSucess += 1;
         }
         else {
            System.out.println("incorrect Answer \n");
            numberOfFailure += 1;
         }
}
         
         System.out.println("Welcome to the eight phase");
         for(int counti = 2; counti < 4; counti++){
             firstNumber = (int)(Math.random()*900);
             secondNumber = (int)(Math.random()*30);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();
               
                 
                if(userAnswer == result){
                    numberOfSucess += 1;
                    System.out.println("Correct Answer");
                   
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }


         System.out.println("Welcome to the ninth phase");
         for(int countin = 4; countin < 6; countin ++){
             firstNumber = (int)(Math.random()*3000);
             secondNumber = (int)(Math.random()*80);
             result = firstNumber - secondNumber;
             System.out.printf("Enter the result of %d - %d: ",firstNumber, secondNumber); 
             userAnswer = scanner.nextInt();
               
                 
                if(userAnswer == result){
                    System.out.println("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    System.out.println("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }


}
int timeStop = (int)System.currentTimeMillis();
totalTime =  timeStart - timeStop;

System.out.println("Your score is:" + numberOfSucess);
System.out.println("Total time spent is: " + totalTime/-1000 + "seconds");
    }



}
