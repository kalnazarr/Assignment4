package abstractFactory;

class KZCarFactory
{
    static Car buildCar(CarType model)
    {
        Car car = null;
        switch (model)
        {
            case MICRO:
                car = new MicroCar(Location.KAZAKHSTAN);
                break;

            case MINI:
                car = new MiniCar(Location.KAZAKHSTAN);
                break;

            case LUXURY:
                car = new LuxuryCar(Location.KAZAKHSTAN);
                break;

            default:
                break;

        }
        return car;
    }
}
