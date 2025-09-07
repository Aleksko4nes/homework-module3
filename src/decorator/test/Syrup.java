package decorator.test;

public class Syrup extends BeverageDecorator{
    public Syrup(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + " with syrup";
    }

    @Override
    public double cost() {
        return super.cost() + 1;
    }
}
