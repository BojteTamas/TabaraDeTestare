package slide14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
  static List<String> strings =
      List.of(
          "As",
          "we",
          "continue",
          "to",
          "outmaneuver",
          "the",
          "uncertainty",
          "caused",
          "by",
          "the",
          "global",
          "pandemic",
          "cloud",
          "has",
          "become",
          "the",
          "urgent",
          "business",
          "imperative",
          "We",
          "have",
          "uncovered",
          "the",
          "five",
          "essential",
          "elements",
          "to",
          "maximizing",
          "its",
          "value");

  public static void main(String[] args) {
    System.out.println("Filter operation");
    Stream<String> stringStream = strings.stream().filter(string -> string.length() > 4);
    stringStream.forEach(strings -> System.out.print(strings + " "));

    System.out.println("\n\n");

    System.out.println("Map operation");
    List<String> collect =
        strings.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
    collect.forEach(strings -> System.out.print(strings + " "));

    System.out.println("\n\n");

    System.out.println("Limit operation");
    List<String> collect1 = strings.stream().limit(3).collect(Collectors.toList());
    collect1.forEach(strings -> System.out.print(strings + " "));

    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10, 10);
    list.stream()
        .distinct()
        .collect(Collectors.toList())
        .forEach(number -> System.out.print(number + " "));
  }
}
