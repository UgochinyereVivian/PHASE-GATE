const prompt = require("prompt-sync")();


let number = 0;
let sum = 0;
let multiply = 0;
let store = 0;
let multiple = 0; 
let storage = 0;
let odd_sum = 0;
let newSum = 0;
let total = 0;

console.log("Enter your card number");
let cardNumber = prompt("");
let card = parseInt(cardNumber);
let newArray = new Array(cardNumber.length);

for (let count = 0; count < newArray.length; count++) {
    number = card % 10;
    newArray[count] = number;
    number = card /= 10;
    card = Math.floor(card); 
}

for (let counter = 1; counter < newArray.length; counter += 2) {
    multiply = newArray[counter] * 2;

    if (multiply > 9) {
        for (let count = 0; count < 2; count++) {
            store += multiply % 10;
            multiply = Math.floor(multiply / 10);
        }
    }

    sum += multiply;
}

newSum += sum + store;

for (let index = 0; index < newArray.length; index += 2) {
    multiple += newArray[index];
}

total += newSum + multiple;

console.log(`Credit Card Number: ${cardNumber}`);
console.log(`Credit Card Length: ${cardNumber.length}`);

if (total % 10 === 0)
    console.log("Credit Card Validity Status: valid");
else
    console.log("Credit Card Validity Status: invalid");

