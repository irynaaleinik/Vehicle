package carTypes;

public class CarShapeFactory {

    public static CarShape createCarBody(String carType){
        CarShape carShape = null;
        switch (carType){
            case "Wagon":
                carShape = new Wagon();
                break;
            case "Sedan":
                carShape = new Sedan();
                break;
            default:
                throw new IllegalArgumentException("Wrong car type selected " + carType);
        }

        return carShape;
    }
}
