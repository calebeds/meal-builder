package drinks;

import items.ColdDrinks;

public class Coke extends ColdDrinks {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public Float getPrice() {
        return 0.76f;
    }
}
