const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = 
  numbers.filter(e => e % 2 === 0)
    .map(e => e * 2)
    .reduce((total, e) => total + e);

console.log(result);

//Each line is cohesive, does only one thing.
//We can easily add, change, or remove the lines in the functional pipeline.
//The code flows from one step to next, and reads like the problem statement.
//the code is less noisy than it was in the previous version.

//But, still, the code takes some effort to parse though by a human eye and has some
//cogitive load. It can be improved.

