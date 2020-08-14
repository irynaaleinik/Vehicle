package car;

import carTypes.CarShape;
import carTypes.CarShapeFactory;
import transmissions.Transmission;
import transmissions.TransmissionFactory;

public class CarBuilder {
    private CarShape carType;
    private Transmission carTransmission;
    private String carColor;

    public CarBuilder setCarType(String carType) {
        this.carType = CarShapeFactory.createCarBody(carType);
        return this;
    }

    public CarBuilder setCarTransmission(String carTransmission) {
        this.carTransmission = TransmissionFactory.createTransmission(carTransmission);
        return this;
    }

    public CarBuilder setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setCar(carType);
        car.setTransmission(carTransmission);
        car.setColor(carColor);
    return car;
    }
}
