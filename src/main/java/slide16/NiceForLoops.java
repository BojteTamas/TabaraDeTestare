package slide16;

import java.util.Arrays;
import java.util.List;

public class NiceForLoops {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    /** v1 */
    int size = numbers.size();
    for (int i = 0; i < size; i++) {
      System.out.println(numbers.get(i));
    }

    /** v2 */
    for (Integer number : numbers) {
      System.out.println(number);
    }

    /** v3 single line of code */
    numbers.forEach((Integer integer) -> System.out.println(integer));
    /**
     * Type inference only in lambda expression. You know that you can only receive an integer from
     * here Parenthesis is optional, but only for one parameter lambdas
     */
    numbers.forEach(integer -> System.out.println(integer));
    /** Method reference */
    numbers.forEach(System.out::println);
  }
}
