package bike_package;

public class BikeCollection implements Bikes {
    static final int number = 10;
    int items;
    Bike[] bikeList;

    public BikeCollection() {
        bikeList = new Bike[number];

        addInformation("Bike Manufacture");
        addInformation("Bike Repair");
        addInformation("Bike Wash");
        addInformation("Bike Modify");
        addInformation("Bike on Rent");
        addInformation("Bike Maintenance");
        items = 0;
    }

    public void addInformation(String info) {
        Bike bike;
        bike = new Bike(info);
        if (items >= number)
            System.err.println("Full");
        else {
            bikeList[items] = bike;
            items++;
        }
    }

    public Iterator createIterator() {
        return new BikeIterator(bikeList);
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
    
    public int Items(int items) {
    	return items;
    }
}