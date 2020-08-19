package slide12;

import java.util.List;

public class Lambda3 {
  // Valid expressions in java 8

  /** Example 3 */
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 20;

    // java 7
    System.out.print(getSumOfTwoNumbers(number1, number2));

    System.out.println();

    // java 8
    List<Integer> integers = List.of(10, 20);
    Integer reduce =
        integers.stream()
            //                .reduce(0, Lambda3::getSumOfTwoNumbers);
            .reduce(0, (integer, integer2) -> integer + integer2);
    System.out.print(reduce);
  }

  public static int getSumOfTwoNumbers(int first, int second) {
    return first + second;
  }
}
