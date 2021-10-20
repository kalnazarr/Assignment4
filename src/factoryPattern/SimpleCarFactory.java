package factoryPattern;

public class SimpleCarFactory {

    public Car createCar(String type) {
        Car car = null;

        if (type.equals("default")) {
            car = new DefaultCar();
        } else if (type.equals("comfort")) {
            car = new ComfortCar();
        } else if (type.equals("sport")) {
            car = new SportCar();
        } else if (type.equals("truck")) {
            car = new Truck();
        }
        return car;
    }
}
