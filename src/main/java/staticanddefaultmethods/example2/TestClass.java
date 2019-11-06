package staticanddefaultmethods.example2;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        Vehicle car1 = new Car("BMW");
        Vehicle car2 = new Car("BMW");
        Vehicle car3 = new Car("Mercedes");

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(car1);
        vehicleList.add(car2);
        vehicleList.add(car3);

        System.out.println(vehicleList.stream()
                .filter(vehicle -> vehicle.getBrand().contentEquals("BMW"))
                .count());

    }
}
