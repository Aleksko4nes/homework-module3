package decorator.test;

public class Latte implements Beverage{
    @Override
    public String description() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
