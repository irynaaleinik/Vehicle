import car.Car;
import car.CarBuilder;

public class CarMaker {
    public static void main(String[] args){
        Car car = new CarBuilder()
                .setCarType("Wagon")
                .setCarTransmission("manual")
                .setCarColor("red")
                .build();
        System.out.println(car);
    }
}
