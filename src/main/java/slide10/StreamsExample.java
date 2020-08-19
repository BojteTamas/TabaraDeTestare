package slide10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
  public static void main(String[] args) {
    int[] arrayExample = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

    IntStream stream = Arrays.stream(arrayExample);
    stream.forEach(p -> System.out.println(p));

    Stream<Integer> streamTwo = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    /** Method reference */
    streamTwo.forEach(System.out::println);
    streamTwo.forEach(p -> System.out.println(p));

    Stream<String> streamThree = Stream.of("d2", "a2", "b1", "b3", "c");

    List<String> stringList = Arrays.asList("sup1", "sup2", "sup3");
    System.out.println(stringList.stream().count());

    List<String> list = Arrays.asList("foo", "bar");
    System.out.println(list.parallelStream().count());
  }
}
