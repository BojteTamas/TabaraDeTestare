package slide6.example2;

public interface Alarm {
  /**
   * Next : public class Car implements Vehicle, Alarm {} Here we need to provide implementation for
   * these two methods because there is the diamond problem We can use both methods by calling
   * Vehicle.super.turnAlarmOff() or Alarm.super.turnAlarmOff()
   *
   * @return
   */
  default String turnAlarmOn() {
    return "Turning the alarm on.";
  }

  default String turnAlarmOff() {
    return "Turning the alarm off.";
  }
}
