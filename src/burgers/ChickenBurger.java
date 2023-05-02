package burgers;

import items.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Float getPrice() {
        return 2.0f;
    }
}
