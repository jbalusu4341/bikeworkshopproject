package bike_package;

public class TestClass {
    public static void main(String[] args) {
        BikeCollection bikes = new BikeCollection();
        BikeList bikeList = new BikeList(bikes);
        bikeList.printBikeList();
        Bike bike = new Bike(10);

        System.out.println();
        BikeWorkMode bikeMode = new BikeWorkMode(bike);

        System.out.println(bikeMode);

        bikeMode.Work();
        bikeMode.Modify();
        bikeMode.Rent();
        System.out.println();

        BikeNotWorkMode bikeNotMode = new BikeNotWorkMode(bike);

        System.out.println(bikeNotMode);

        bikeNotMode.Work();
        bikeNotMode.Rent();

        System.out.println();
        Bike BIKE = new Bike();

        BikeAvailable available = new BikeAvailable(BIKE);
        BikeNotAvailable notAvailable = new BikeNotAvailable(BIKE);

        Order order = new Order();

        order.takeOrder(available);
        order.takeOrder(notAvailable);

        order.placeOrder();

        System.out.println();
        BikeBuilder bikeBuilder = new HeavyBike();

        available.available();
        Bike build = bikeBuilder.addBikeName().addWork().addBikeNumber().addCustomerName().addCustomerNumber().build();
        build.Construction();
        build.Repair();
        build.Maintenance();
        build.Ready();
        System.out.println(build);

        BikeBuilder bikeBuilder1 = new TrailBike();

        available.available();

        Bike build1 = bikeBuilder1.addBikeName().addWork().addBikeNumber().addCustomerName().addCustomerNumber().build();
        build1.Construction();
        build1.Repair();
        build1.Maintenance();
        build1.Ready();
        System.out.println(build1);
    }
}
