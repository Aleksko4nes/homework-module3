package strategy;

public class PythonDeveloper implements DeveloperStrategy{
    @Override
    public void writingCode() {
        System.out.println("Writing Python Code...");
    }
}
