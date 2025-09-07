package chain;

public class LogReportMessageSender extends Notifier{

    public LogReportMessageSender(PriorityLevel priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Log Report message: " + message);
    }
}
