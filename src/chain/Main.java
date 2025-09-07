package chain;

public class Main {
    public static void main(String[] args) {
        Notifier logNotifier = new LogReportMessageSender(PriorityLevel.LOW);
        Notifier emailNotifier = new EmailReportMessageSender(PriorityLevel.MIDDLE);
        Notifier smsNotifier = new SmsReportMessageSender(PriorityLevel.HIGH);

        logNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        logNotifier.messageSenderManager("Something wrong", PriorityLevel.LOW);
        System.out.println();
        logNotifier.messageSenderManager("Something middle wrong", PriorityLevel.MIDDLE);
        System.out.println();
        logNotifier.messageSenderManager("High problem", PriorityLevel.HIGH);
    }
}
