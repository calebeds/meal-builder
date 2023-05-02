package drinks;

import items.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public Float getPrice() {
        return 0.5f;
    }
}
