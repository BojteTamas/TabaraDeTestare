package slide6.example2;

public class Car implements Vehicle { // TODO hint : try to implement two interfaces
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
