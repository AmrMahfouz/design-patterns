package builder.burgers;

import builder.Item;
import builder.Packing;
import builder.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }

}
