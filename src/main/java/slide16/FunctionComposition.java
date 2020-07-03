package slide16;

import java.util.Arrays;
import java.util.List;

public class FunctionComposition {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // given the values, double the even numbers and total
    int result = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        result = number * 2; // spagetti code you are looking from up to down
      }
    }
    System.out.println(result);

    // With Java 8
    int sum =
        numbers.stream()
            .filter(integer -> integer % 2 == 0) // da-mi
            //                        .map(integer -> integer * 2)
            .mapToInt(FunctionComposition::getIntegerToIntFunction)
            //                        .reduce(0, Integer::sum));
            .sum();
    System.out.println(sum);
  }

  private static int getIntegerToIntFunction(int integer) {
    return integer * 2;
  }
}
