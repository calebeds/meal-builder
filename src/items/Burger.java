package items;

import packing.Packing;
import packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
