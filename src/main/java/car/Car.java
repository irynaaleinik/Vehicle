package car;

import carTypes.CarShape;
import transmissions.Transmission;

public class Car{
    private CarShape carType;
    private Transmission transmission;
    private String carColor;

    void setCar(CarShape car) {
        this.carType = car;
    }

    void setColor(String color) {
        this.carColor = color;
    }

    void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    Car() {
    }

    @Override
    public String toString() {
        return "New " + carColor + " " + carType.getClass().getSimpleName() + " is created. It has " + transmission.getClass().getSimpleName();
    }
}
