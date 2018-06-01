package builder.drinks;

import builder.Item;
import builder.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

}
