package decoratorPattern;


public class Milk extends CoffeeDecorator {
    public Milk(Coffee wrappedCoffee) {
        super(wrappedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 25.00;
    }
}