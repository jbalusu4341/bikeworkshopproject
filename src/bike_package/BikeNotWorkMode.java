package bike_package;

public class BikeNotWorkMode implements State{
    Bike bike;

    public BikeNotWorkMode(Bike bike) {
        this.bike = bike;
    }

    public BikeNotWorkMode() {
	}

    
	@Override
    public void Work() {
        System.out.println("Your Bike is in not working mode.");
    }

    @Override
    public void Modify() {
        System.out.println("Your Bike Modification is not complete yet.");
    }

    @Override
    public void Rent() {
        System.out.println("No Bike is on Rent.");
    }

    @Override
    public String toString() {
        return "Not Working Mode";
    }
}

