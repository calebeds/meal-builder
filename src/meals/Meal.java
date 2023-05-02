package meals;

import items.Item;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Meal {

    private ArrayList<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }

    public Float getCost() {
        return items.stream().map(Item::getPrice).reduce(0.0f, Float::sum);
    }

    public void showItems() {
        System.out.println("Items: ");
        items.forEach(item -> {
            System.out.println("--Name of the Item: " + item.getName());
            System.out.println("--Price: " + item.getPrice());
            System.out.println("--Packaging Type: " + item.getPacking().pack());
        });
        System.out.println("\nTotal Price: " + getCost() + "\n");
    }
}
