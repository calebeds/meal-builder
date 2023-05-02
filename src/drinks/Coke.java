package drinks;

import items.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public Float getPrice() {
        return 0.76f;
    }
}
