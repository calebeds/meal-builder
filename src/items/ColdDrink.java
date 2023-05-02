package items;

import packing.Bottle;
import packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
