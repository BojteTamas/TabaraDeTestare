package slide6.example1;

interface Visible {
  default void visible() {
    System.out.println("visible");
  }

  default void print() {
    System.out.println("staticAndDefaultMethods.Visible");
  }
}