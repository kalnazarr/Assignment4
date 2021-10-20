package abstractFactory;

class CarFactory
{
    private CarFactory()
    {

    }
    public static Car buildCar(CarType type)
    {
        Car car = null;
        Location location = Location.KAZAKHSTAN;

        switch(location)
        {
            case USA:
                car = USACarFactory.buildCar(type);
                break;

            case KAZAKHSTAN:
                car = KZCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);

        }

        return car;

    }
}

