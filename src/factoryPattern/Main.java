package factoryPattern;

public class Main {
    public static void main(String[] args) {
        SimpleCarFactory factory = new SimpleCarFactory();
        CarStore store = new CarStore(factory);

        Car car = store.orderCar("default");
        System.out.println("We ordered a " + car.getName() + "\n");

        car = store.orderCar("comfort");
        System.out.println("We ordered a " + car.getName() + "\n");

        car = store.orderCar("sport");
        System.out.println("We ordered a " + car.getName() + "\n");

        car = store.orderCar("truck");
        System.out.println("We ordered a " + car.getName() + "\n");
    }
}
