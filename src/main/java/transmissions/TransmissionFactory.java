package transmissions;

public class TransmissionFactory {

    public static Transmission createTransmission(String transmissionType) {
        Transmission transmission = null;
        switch (transmissionType){
            case "manual":
                transmission = new ManualTransmission();
                break;
            case "automatic":
                transmission = new AutomaticTransmission();
                break;
            default:
                throw new IllegalArgumentException("Wrong transmission type:" + transmissionType);
        }
        return transmission;
    }
}
