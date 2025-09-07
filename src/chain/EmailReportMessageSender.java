package chain;

public class EmailReportMessageSender extends Notifier{

    public EmailReportMessageSender(PriorityLevel priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email sender: " + message);
    }
}
