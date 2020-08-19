package slide6.example1;

interface Clickable {
  default void click() {
    System.out.println("click");
  }

  default void print() {
    System.out.println("Click");
  }
}
