package factoryPattern;

public class DefaultCar extends Car {
    public DefaultCar() {
        name = "Default Car";
        speed = 60;
        baggageWeight = 60;
        forWhat.add("For city trips");
        forWhat.add("Has 4 passenger seats and 1 driver");
        forWhat.add("Standard machine fits all standards");
    }
}