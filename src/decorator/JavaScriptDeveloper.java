package decorator;

public class JavaScriptDeveloper extends DeveloperDecorator{
    public JavaScriptDeveloper(Developer developer) {
        super(developer);
    }
    public void writeJSCode() {
        System.out.println(" Writing JS code...");
    }

    @Override
    public void writeCode() {
        super.writeCode(); writeJSCode();
    }
}
