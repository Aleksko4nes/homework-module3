package decorator;

public abstract class DeveloperDecorator implements Developer{
    protected Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void writeCode() {
        developer.writeCode();
    }
}
