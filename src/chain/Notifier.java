package chain;

public abstract class Notifier {
    private PriorityLevel priority;
    private Notifier nextNotifier;

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public Notifier(PriorityLevel priority) {
        this.priority = priority;
    }

    public void messageSenderManager(String message, PriorityLevel level) {
        if (level.ordinal() >= priority.ordinal()) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.messageSenderManager(message, level);
        }
    }

    public abstract void write(String message);
}
