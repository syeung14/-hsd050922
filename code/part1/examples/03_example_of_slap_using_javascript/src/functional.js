const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const result = 
  numbers.filter(function(e) { return e % 2 === 0; })
    .map(function(e) { return e * 2; })
    .reduce(function(total, e) { return total + e; });

console.log(result);

//Each line is cohesive, does only one thing.
//We can easily add, change, or remove the lines in the functional pipeline.
//The code flows from one step to next, and reads like the problem statement.

//But, still, the code is noisy and takes effort to read. It can be improved.

