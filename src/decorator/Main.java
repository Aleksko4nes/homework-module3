package decorator;

public class Main {
    public static void main(String[] args) {
        Developer java = new JavaDeveloper();
        java.writeCode();

        Developer decorated = new JavaScriptDeveloper(java);
        decorated.writeCode();
    }
}
