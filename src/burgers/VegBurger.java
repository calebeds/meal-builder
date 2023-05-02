package burgers;

import items.Burger;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veggie Burger";
    }

    @Override
    public Float getPrice() {
        return 1.0f;
    }
}
