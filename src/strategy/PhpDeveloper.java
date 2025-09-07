package strategy;

public class PhpDeveloper implements DeveloperStrategy{
    @Override
    public void writingCode() {
        System.out.println("Writing PHP code...");
    }
}
