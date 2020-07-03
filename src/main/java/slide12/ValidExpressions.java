package slide12;

public class ValidExpressions {
  interface HelloNewWorld {
    void hello(String name);
  }

  interface SecondExample {
    boolean isLength(String name);
  }

  interface ThirdExample {
    void sum(int x, int y);
  }

  interface FourthExample {
    int getNumber();
  }

  interface FifthExample {
    boolean compare(String one, String two);
  }

  public static void main(String[] args) {
    // 1.
    ValidExpressions.HelloNewWorld greetingMessage =
        (String name) -> System.out.println("Hello, " + name);
    greetingMessage.hello("From the other side");

    // 2.
    ValidExpressions.SecondExample isLongerThanFive = (String string) -> string.length() > 5;
    System.out.println(isLongerThanFive.isLength("Patru"));

    // 3.
    ValidExpressions.ThirdExample sumOfTwoNumbers =
        (int x, int y) -> {
          System.out.println("Result:");
          System.out.println(x + y);
        };
    sumOfTwoNumbers.sum(5, 10);

    // 4.
    ValidExpressions.FourthExample get43 = () -> 43;
    System.out.println("my number is " + get43.getNumber());

    // 5.
    ValidExpressions.FifthExample areTwoStringsEqual = (String one, String two) -> one.equals(two);
    System.out.println("My strings are equal" + areTwoStringsEqual.compare("Unu", "doi"));
  }
}
