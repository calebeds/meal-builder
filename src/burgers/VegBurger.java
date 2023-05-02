package burgers;

import items.Burgers;

public class VegBurger extends Burgers {
    @Override
    public String getName() {
        return "Veggie Burger";
    }

    @Override
    public Float getPrice() {
        return 1.0f;
    }
}
