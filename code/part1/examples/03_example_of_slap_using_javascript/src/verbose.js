const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

let result = 0;

for(let i = 0; i < numbers.length; i++) {
  if(numbers[i] % 2 === 0) {
    result += numbers[i] * 2;
  }
}

console.log(result);

//We can say that is not a lot of lines of code, but what about the quality of code?

//this code is very familiar but not simple
//it lacks cohesion and also violates SLAP

//As we read the code, we keep diving into more details. We work with a collection of
//numbers, then we examine a number, then we do math to mutiplly and then add...

//To comprehend we have to parse and retain quite some details, even in this small piece
//of code.

