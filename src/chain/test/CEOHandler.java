package chain.test;

public class CEOHandler extends Handler{
    @Override
    public void handleRequest(int amount) {
        System.out.println("CEO approved the expense of " + amount + " USD");
    }
}
