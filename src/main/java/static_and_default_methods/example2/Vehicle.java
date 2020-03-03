package static_and_default_methods.example2;

public interface Vehicle {
  static int getHorsePower(int rpm, int torque) {
    return (rpm * torque) / 5252;
  }

  String getBrand();

  String speedUp();

  String slowDown();

  default String turnAlarmOn() {
    return "Turning the vehicle alarm on.";
  }

  default String turnAlarmOff() {
    return "Turning the vehicle alarm off.";
  }
}
