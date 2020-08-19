package slide12;

import java.util.List;
import java.util.stream.Collectors;

public class Lambda4 {
  /** Example 4 */
  public static void main(String[] args) {
    // java 7
    System.out.print(getFortyTwo());

    System.out.println();

    // java 8
    List<Integer> integers = List.of(10, 20);
    List<Integer> collect = integers.stream().map(integer -> 42).collect(Collectors.toList());
    System.out.println(collect.toString());
  }

  public static int getFortyTwo() {
    return 42;
  }
}
