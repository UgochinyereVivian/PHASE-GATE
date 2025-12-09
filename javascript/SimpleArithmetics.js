        



let result = firstNumber - secondNumber;
        let userAnswer = 0;
        let numberOfSucess = 0;
        let numberOfFailure = 0;
        let startdate = Date.now()
     


    

for(let count = 0; count <= 2; count++){
    
    for(let counter = 0; count < 2; count++){
        var firstNumber = Math.floor(Math.random(10)+500);
        var secondNumber = Math.floor(Math.random(10)+30); 
        let result = firstNumber - secondNumber;
        console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
        const prompt = require("prompt-sync")();
        let neww = prompt("result: ") 
        let userAnswer = parseInt(neww) 

             if(userAnswer == result){
                console.log("Correct Answer");
                numberOfSucess += 1;
             }
             else {
                console.log("incorrect Answer \n");
                numberOfFailure += 1;
             }

    }
     




    console.log("Welcome to the second phase");
    for(let counti = 2; counti < 4; counti++){
        var firstNumber = Math.floor(Math.random(10)+50);
        var secondNumber = Math.floor(Math.random(10)+30); 
         let result = firstNumber - secondNumber;
        console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
        const prompt = require("prompt-sync")();
        let neww = prompt("result: ") 
        let userAnswer = parseInt(neww) 
               77
            if(userAnswer == result){
                console.log("Correct Answer");
                numberOfSucess += 1;
             }
             else {
                 console.log("incorrect Answer");
                 numberOfFailure += 1;
                 
             }
                
               
     }





    console.log("Welcome to the third phase");
    for(let countin = 4; countin < 6; countin ++){
        console.log("Enter the result of firstNumber - secondNumber"); 
        var firstNumber = Math.floor(Math.random(10)+800);
        var secondNumber = Math.floor(Math.random(10)+30); 
         let result = firstNumber - secondNumber;
        console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
        const prompt = require("prompt-sync")();
        let neww = prompt("result: ") 
        let userAnswer = parseInt(neww) 
            if(userAnswer == result){
                console.log("Correct Answer");
                numberOfSucess += 1;
                }
            else {
               console.log("incorrect Answer");
               numberOfFailure += 1;
                 
                }
                
               
             }
}





console.log("Welcome to the fourth phase");
for (let count = 0; count <= 2; count++){
    
        var firstNumber = Math.floor(Math.random(10)+90);
        var secondNumber = Math.floor(Math.random(10)+70); 
         let result = firstNumber - secondNumber;
        console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
        const prompt = require("prompt-sync")();
        let neww = prompt("result: ") 
        let userAnswer = parseInt(neww) 

            if(userAnswer == result){
                console.log("Correct Answer");
                numberOfSucess += 1;
            }
            else {
                console.log("incorrect Answer \n");
                numberOfFailure += 1;
            }
}
         




         console.log("Welcome to the fifth phase");
         for(let counti = 2; counti < 4; counti++){
            var firstNumber = Math.floor(Math.random(10)+60);
            var secondNumber = Math.floor(Math.random(10)+20); 
             let result = firstNumber - secondNumber;
            console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
            const prompt = require("prompt-sync")();
            let neww = prompt("result: ") 
            let userAnswer = parseInt(neww) 
               
                if(userAnswer == result){
                    numberOfSucess += 1;
                    console.log("Correct Answer");
                    
                }
                else {
                   console.log("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }



         console.log("Welcome to the sixth phase");
         for(let countin = 4; countin < 6; countin ++){
            var firstNumber = Math.floor(Math.random(10)+40);
            var secondNumber = Math.floor(Math.random(10)+10);
             let result = firstNumber - secondNumber; 
            console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
            const prompt = require("prompt-sync")();
            let neww = prompt("result: ") 
            let userAnswer = parseInt(neww)  
                 
                if(userAnswer == result){
                   console.log("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    console.log("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }




console.log("Welcome to the seventh phase");
for  (let count = 0; count <= 2; count++){
    
        var firstNumber = Math.floor(Math.random(10)+70);
        var secondNumber = Math.floor(Math.random(10)+40); 
         let result = firstNumber - secondNumber;
        console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
        const prompt = require("prompt-sync")();
        let neww = prompt("result: ") 
        let userAnswer = parseInt(neww) 

         if(userAnswer == result){
            console.log("Correct Answer");
            numberOfSucess += 1;
         }
         else {
           console.log("incorrect Answer \n");
            numberOfFailure += 1;
         }
}
       
  
         console.log("Welcome to the eight phase");
         for(let counti = 2; counti < 4; counti++){
            var firstNumber = Math.floor(Math.random(10)+20);
            var secondNumber = Math.floor(Math.random(10)+10); 
             let result = firstNumber - secondNumber;
            console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
            const prompt = require("prompt-sync")();
            let neww = prompt("result: ") 
            let userAnswer = parseInt(neww) 
               
                 
                if(userAnswer == result){
                    numberOfSucess += 1;
                   console.log("Correct Answer");
                   
                }
                else {
                    console.log("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }


         console.log("Welcome to the ninth phase");
         for(let countin = 4; countin < 6; countin ++){
            var firstNumber = Math.floor(Math.random(10)+90);
            var secondNumber = Math.floor(Math.random(10)+60); 
             let result = firstNumber - secondNumber;
            console.log("Enter the result of: ", firstNumber, " - " ,secondNumber, " : "); 
            const prompt = require("prompt-sync")();
            let neww = prompt("result: ") 
            let userAnswer = parseInt(neww) 
               
                if(userAnswer == result){
                    console.log("Correct Answer");
                    numberOfSucess += 1;
                }
                else {
                    console.log("incorrect Answer");
                    numberOfFailure += 1;
                 
                }
                
               
            }



let stopdate = Date.now()
let total = (startdate - stopdate)/-1000
console.log(`Your score is: ${numberOfSucess}` );
console.log(`Total Time Spent is: ${total} seconds` );


