package decorator.test;

public class Main {
    public static void main(String[] args) {
        Beverage latte = new Latte();
        Beverage espresso = new Espresso();

        System.out.println(latte.description());
        System.out.println(latte.cost());
        System.out.println(espresso.description());
        System.out.println(espresso.cost());

        Beverage latteWithMilk = new Milk(latte);
        Beverage espressoWithSyrup = new Syrup(espresso);

        System.out.println(latteWithMilk.description());
        System.out.println(latteWithMilk.cost());
        System.out.println(espressoWithSyrup.description());
        System.out.println(espressoWithSyrup.cost());
    }
}
