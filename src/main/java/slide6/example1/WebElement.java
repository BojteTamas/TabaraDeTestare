package slide6.example1;

interface Clickable {
  default void click() {
    System.out.println("click");
  }

  default void print() {
    System.out.println("Click");
  }
}

interface Visible {
  default void visible() {
    System.out.println("visible");
  }

  default void print() {
    System.out.println("staticAndDefaultMethods.Visible");
  }
}

/** Exemplu de multiple inheritance in Java 8 */
public class WebElement implements Clickable, Visible {
  public static void main(String[] args) {
    WebElement webElement = new WebElement();
    webElement.click();
    webElement.visible();
    webElement.print();
  }

  @Override
  public void print() { // TODO add the print from Visible or Clickable class
    System.out.println("Webelement");
  }
}
