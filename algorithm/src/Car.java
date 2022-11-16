public class Car extends Vehicle{
    String Trans;

    public Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        Trans = trans;
    }

    public Car(String trans) {

    }

    public Car(String type, int maxSpeed,String trans) {
        this(trans);
        super(type, maxSpeed);
    }
}
