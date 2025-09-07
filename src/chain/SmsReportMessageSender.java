package chain;

public class SmsReportMessageSender extends Notifier{

    public SmsReportMessageSender(PriorityLevel priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("sms reporting: " + message);
    }
}
