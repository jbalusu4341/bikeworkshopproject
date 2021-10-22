package bike_package;

public class BikeNotAvailable implements Workshop {
    private Bike bike;

    public BikeNotAvailable(Bike bike) {
        this.bike = bike;
    }

    public void Not_available(){
        System.out.println("Bike is Not Available");
    }
    
    public void execute(){
        bike.off();
    }
}
