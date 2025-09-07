package chain.test;

public class DepartamentHandler extends Handler {
    @Override
    public void handleRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Department Manager approved the expense of " + amount + " USD");
        } else if (next != null) {
            next.handleRequest(amount);
        } else {
            System.out.println("Request for " + amount + " is rejected");
        }
    }
}
