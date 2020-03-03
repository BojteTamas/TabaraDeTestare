package lambda.functions;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    numbers.forEach(System.out::println);

    /** ex 2 Static reference */
    numbers.stream()
        //                .map( integer -> String.valueOf(integer))
        .map(String::valueOf)
        .forEach(System.out::println);

    /** ex 3 Instance reference */
    numbers.stream()
        //                .map( integer -> String.valueOf(integer))
        .map(String::valueOf)
        .map(String::toLowerCase)
        .forEach(System.out::println);

    /** ex 4 Two Parameters : sum of numbers */
    System.out.println(
        numbers.stream()
            .
            // reduce(0, (total, number) -> Integer.sum(total , number))
            // the order does not matter
            reduce(0, Integer::sum));

    /** ex 5 Two Parameters : concat strings */
    System.out.println(
        numbers.stream()
            .map(integer -> String.valueOf(integer))
            // .reduce("", (s, s2) -> s.concat(s2) )
            .reduce("", String::concat));
  }
}
