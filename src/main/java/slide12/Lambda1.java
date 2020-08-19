package slide12;

import java.util.List;

public class Lambda1 {
  // Valid expressions in java 8

  /** Example 1 */
  public static void main(String[] args) {
    List<String> technology =
        List.of(
            "Technology Home",
            "Accenture Labs",
            "Adobe",
            "Application Services",
            "Blockchain",
            "Cloud",
            "Microsoft",
            "Oracle",
            "Salesforce",
            "SAP",
            "Security",
            "Software Engineering",
            "Technology Consulting",
            "Workday");
    // java 7
    for (String string : technology) {
      System.out.print(getStringLength(string) + " ");
    }

    System.out.println();

    // java 8
    technology.stream()
        .map(string -> string.length()) // making a Stream of Integer
        .forEach(integer -> System.out.print(integer + " "));
  }

  public static int getStringLength(String string) {
    return string.length();
  }
}
