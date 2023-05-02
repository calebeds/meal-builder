package drinks;

import items.ColdDrinks;

public class Pepsi extends ColdDrinks {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public Float getPrice() {
        return 0.5f;
    }
}
