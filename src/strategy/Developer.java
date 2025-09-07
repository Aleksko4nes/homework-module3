package strategy;

public class Developer {
    private DeveloperStrategy developerStrategy;


    public Developer(DeveloperStrategy developerStrategy) {
        this.developerStrategy = developerStrategy;
    }

    public void setDeveloperStrategy(DeveloperStrategy developerStrategy) {
        this.developerStrategy = developerStrategy;
    }

    public void writeCode() {
        developerStrategy.writingCode();
    }
}

