package bike_package;

public class BikeIterator implements Iterator {
    Bike[] bikeList;
    int list;

    {
        list = 0;
    }

    public BikeIterator(Bike[] bikeList) {
        this.bikeList = bikeList;
    }

    @Override
    public boolean hasNext() {
        return list < bikeList.length &&
                bikeList[list] != null;
    }

    @Override
    public Object next() {
        Bike bike = bikeList[list];
        list += 1;
        return bike;
    }
}
