package factoryPattern;

public class ComfortCar extends Car {
    public ComfortCar() {
        name = "Comfort Car";
        speed = 120;
        baggageWeight = 100;
        forWhat.add("All seats with massage and heating");
        forWhat.add("Air conditioning");
        forWhat.add("3 seats for passengers and 1 for the driver");
    }
}
