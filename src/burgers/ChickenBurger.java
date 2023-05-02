package burgers;

import items.Burgers;

public class ChickenBurger extends Burgers {
    @Override
    public String getName() {
        return "Chicken Burger";
    }

    @Override
    public Float getPrice() {
        return 2.0f;
    }
}
