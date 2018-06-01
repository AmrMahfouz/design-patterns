package builder.burgers;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
