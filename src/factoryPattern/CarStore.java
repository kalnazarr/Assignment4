package factoryPattern;

public class CarStore {
    SimpleCarFactory factory;

    public CarStore(SimpleCarFactory factory) {
        this.factory = factory;
    }

    public Car orderCar(String type) {
        Car car;

        car = factory.createCar(type);

        car.transport();
        car.assembly();
        car.painting();
        car.export();

        return car;
    }
}
