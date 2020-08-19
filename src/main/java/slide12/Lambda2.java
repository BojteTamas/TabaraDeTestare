package slide12;

import java.util.List;

public class Lambda2 {

  /** Example 2 */
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
      if (stringIsLongerThanTen(string)) {
        System.out.print(string + " ");
      }
    }

    System.out.println();

    // java 8
    technology.stream()
        .filter(stringul -> stringul.length() > 10)
        .forEach(integer -> System.out.print(integer + " "));
  }

  public static boolean stringIsLongerThanTen(String string) {
    return string.length() > 10;
  }
}
