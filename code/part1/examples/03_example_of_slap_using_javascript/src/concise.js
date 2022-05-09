const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const isEven = number => number % 2 === 0;
const double = number => number * 2;
const sum = (a, b) => a + b;

const result = 
  numbers
    .filter(isEven)
    .map(double)
    .reduce(sum);

console.log(result);

//Each line is cohesive, does only one thing.
//We can easily add, change, or remove the lines in the functional pipeline.
//The code flows from one step to next, and reads like the problem statement.
//the code is less noisy than it was in the previous version.
//It is easier to comprehend
//It is self-explaining or self-documenting

//The code favors SLAP

//This is also an example of compose method pattern, that is, the instructions in 
//a function are composed at the same level of details and the function acts as a 
//recipe at that level of detail.

