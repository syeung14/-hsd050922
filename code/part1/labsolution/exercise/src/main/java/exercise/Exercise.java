package exercise;

import java.util.*;

import static java.util.stream.Collectors.joining;

public final class Exercise {
  public static String commaSeparatedNamesOfLength(List<String> names, int length) {
    return names.stream()
      .filter(name -> name.length() == length)
      .map(String::toUpperCase)
      .collect(joining(", "));
  }

  //the function needs a better name
  private static boolean isEven(int number) { return number % 2 == 0; }
  private static boolean isGT3(int number) { return number > 3; }
  private static boolean checkSqrt(int number) { return Math.sqrt(number) < 3; }
  private static int doubleIt(int number) { return number * 2; }

  public static double calculate(List<Integer> numbers) {
    return numbers.stream()
      .filter(Exercise::isEven)
      .filter(Exercise::isGT3)
      .filter(Exercise::checkSqrt)
      .mapToDouble(Exercise::doubleIt)
      .sum();
    //Should we combine the predicates into one filter or write multiple filters?
    //Please write multiple filters as that makes the code more cohesive and easier
    //to change as well. We can easily add new predicates, we can remove existing ones easily
    //as well.
  }
}
