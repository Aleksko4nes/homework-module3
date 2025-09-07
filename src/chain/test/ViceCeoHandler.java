package chain.test;

public class ViceCeoHandler extends Handler{
    @Override
    public void handleRequest(int amount) {
        if (amount <= 10000) {
            System.out.println("ViceCeo accept");
        } else if (next != null) {
            next.handleRequest(amount);
        } else {
            System.out.println("Rejected");
        }
    }
}
