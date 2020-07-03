package slide3;

public class HelloWorldLambda {
  interface HelloNewWorld {
    String hello(String name);
  }

  public static void main(String[] args) {
    HelloNewWorld greetingMessage =
        (String name) -> {
          return "Hello, " + name;
        };
    System.out.println(greetingMessage.hello("Joe"));
  }
}
