package items;

import packing.Packing;

public interface Item {
    String getName();
    Float getPrice();
    Packing getPacking();
}
