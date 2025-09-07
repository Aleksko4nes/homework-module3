package chain.test;

public class ManagerHandler extends Handler {
    @Override
    public void handleRequest(int amount) {
        if (amount <= 5000) {
            System.out.println("Manager approved the expense of " + amount + " USD");
        } else if (next != null) {
            next.handleRequest(amount);
        } else {
            System.out.println("Request for " + amount + " USD rejected");
        }
    }
}
