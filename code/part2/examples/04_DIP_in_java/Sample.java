import java.util.*;

public class Sample {
  public static void process(Iterator<Integer> iterator) {
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println(iterator.getClass());
  }

  public static void main(String[] args) {
    List<Integer> numbers1 = new ArrayList(List.of(1, 2, 3));
    Set<Integer> numbers2 = new HashSet(List.of(1, 2, 3));

    process(numbers1.iterator()); //this is like calling getRemote() in solution2
    System.out.println("------");
    process(numbers2.iterator());

    //It turns out Java's List, Set, and C#'s List, Set, etc. use the same idea as in
    //solution 2 to implement iterators. Why? They want different views on the collection
    //and be able to do concurrent iterations.
  }
}

//The iterators are implemented as inner classes in Java and C#

