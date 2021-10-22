package bike_package;
public class BikeList {
    BikeCollection bikes;

    public BikeList(BikeCollection bikes) {
        this.bikes = bikes;
    }

    public void printBikeList() {
        Iterator iterator = bikes.createIterator();
        System.out.println("\" LIST OF BIKE WORKSHOP SERVICES \"");
        System.out.println();
        while (iterator.hasNext()) {
            Bike list = (Bike) iterator.next();
            System.out.println(list.getBike());
        }
    }
}
