package decorator.test;

public class Milk extends BeverageDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
