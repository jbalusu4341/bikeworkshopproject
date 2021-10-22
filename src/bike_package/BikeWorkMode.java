package bike_package;

public class BikeWorkMode implements State {
    Bike bike;

    public BikeWorkMode(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void Work() {
        System.out.println("Please wait, your Bike is in repairing mode.");
    }

    @Override
    public void Modify() {
        System.out.println("Your Bike Modification is complete.");
    }

    @Override
    public void Rent() {
        System.out.println("Bike is on Rent.");
        bike.releaseBike();
        if (bike.getCount() > 0) {
            bike.setState(bike.getBikeDeliver());
        } else {
            System.out.println("Oops, out of Bikes!");
            bike.setState(bike.getBikeMode());
        }
    }

    @Override
    public String toString() {
        return "Working Mode";
    }
}
