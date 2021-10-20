package factoryPattern;

public class Truck extends Car {
    public Truck() {
        name = "Truck";
        speed = 40;
        baggageWeight = 1000;
        forWhat.add("For transporting heavy loads");
        forWhat.add("You can fit 1000 kg");
        forWhat.add("Have 2 seats for passengers and 1 for the driver");
    }
}
