public class Vehicle {
    String type  = "4w";
    int maxSpeed = 100;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
