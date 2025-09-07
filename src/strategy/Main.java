package strategy;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(new JavaDeveloper());
        developer.writeCode();

        developer.setDeveloperStrategy(new PhpDeveloper());
        developer.writeCode();

        developer.setDeveloperStrategy(new PythonDeveloper());
        developer.writeCode();
    }
}
