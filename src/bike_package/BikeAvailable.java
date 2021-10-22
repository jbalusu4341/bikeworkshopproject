package bike_package;

public class BikeAvailable implements Workshop {
    private Bike bike;

    public BikeAvailable(Bike bike) {
        this.bike = bike;
    }

    public void available(){
        System.out.println("Bike is Available");
    }

    public void execute(){
        bike.on();
    }
}
