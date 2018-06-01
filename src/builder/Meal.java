package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;

    public Meal() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        double cost = 0;
        for (Item item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.getName());
            System.out.print(", Packing : " + item.getPacking().pack());
            System.out.println(", Price : " + item.getPrice());
        }
    }

}
