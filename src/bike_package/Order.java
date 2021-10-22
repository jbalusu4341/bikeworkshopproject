package bike_package;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Workshop> list = new ArrayList<Workshop>();

    public void takeOrder(Workshop shop){
        list.add(shop);
    }

    public void placeOrder(){
        for(Workshop shop : list){
            shop.execute();
        }
        list.clear();
    }
}
