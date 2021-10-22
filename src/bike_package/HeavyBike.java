package bike_package;

public class HeavyBike extends BikeBuilder implements Workshop{

    public HeavyBike() {
        this.name = "Heavy Bikes";
    }

    public int Number(int num) {
    	return num;
    }
    
    public int CustomerID(int id) {
    	return id;
    }
    
    @Override
    public BikeBuilder addBikeName() {
        this.workshop.add("Heavy Bike");
        return this;
    }

    @Override
    public BikeBuilder addWork() {
        this.workshop.add("Bike Repair");
        return this;
    }

    @Override
    public BikeBuilder addBikeNumber() {
        this.workshop.add("Bike Number LED-850");
        return this;
    }

    @Override
    public BikeBuilder addCustomerName() {
        this.workshop.add("Jagadeesh Babu");
        return this;
    }

    @Override
    public BikeBuilder addCustomerNumber() {
        this.workshop.add("16789");
        return this;
    }

    @Override
    public void execute() {
    }
}
