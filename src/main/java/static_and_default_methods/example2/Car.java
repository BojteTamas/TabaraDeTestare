package static_and_default_methods.example2;

public class Car implements Vehicle { // TODO Add Alarm Interface
  private String brand;

  Car(String brand) {
    this.brand = brand;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public String speedUp() {
    return "The car is speeding up.";
  }

  @Override
  public String slowDown() {
    return "The car is slowing down.";
  }
}
