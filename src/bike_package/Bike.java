package bike_package;

import java.util.List;

public class Bike {
    State BikeMode;
    State BikeDeliver;
    String name;
    List<String> bikes;
    State state;
    int count = 0;
    private String name1 = "Heavy Bike";
    private String color = "Brown";

    public Bike() {
    }

    void bikes(List<String> bikes) {
        this.bikes = bikes;
    }

    void Construction() {
        System.out.println("Under-Construction " + name1);
        System.out.println("Repair...");
        System.out.println("Maintenance...");
        System.out.println("Wash...");
        System.out.println("Ready.");
        for (String bikes : bikes) {
            System.out.println("   " + bikes);
        }
    }

    void Repair() {
        System.out.println("Bike Repair in 25 minutes");
    }

    void Maintenance() {
        System.out.println("Bike Maintenance end in 10 minutes");
    }

    void Ready() {
        System.out.println("Your Bike is Ready.");
    }

    public Bike(int numberOfBikes) {
        BikeMode = new BikeWorkMode(this);
        BikeDeliver = new BikeNotWorkMode(this);
        this.count = numberOfBikes;
        if (numberOfBikes > 0) {
            state = BikeDeliver;
        } else {
            state = BikeMode;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getBikeMode() {
        return BikeMode;
    }

    public State getBikeDeliver() {
        return BikeDeliver;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    void Bike(List<String> bikes) {
        this.bikes = bikes;
    }

    public Bike(String name) {
        this.name = name;
    }

    public String getBike() {
        return name;
    }

    public void on(){
        System.out.println("Bike (Name =  " +name1+ " Color = " +color+") Done Maintenance ");
    }

    public void off(){
        System.out.println("Bike (Name = " +name1+ " Color = " +color+") NOT Done Maintenance ");
    }

    void releaseBike() {
        System.out.println("A bike comes back...");
        if (count > 0) {
            count = count - 1;
        }
    }
    
    public int price(int p) {
    	return p;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (String bikes : bikes) {
            display.append(bikes + "\n");
        }
        return display.toString();
    }
}

