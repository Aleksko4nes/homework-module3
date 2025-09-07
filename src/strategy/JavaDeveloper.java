package strategy;

public class JavaDeveloper implements DeveloperStrategy{
    @Override
    public void writingCode() {
        System.out.println("Writing Java code...");
    }
}
