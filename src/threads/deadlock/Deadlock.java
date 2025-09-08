package threads.deadlock;

public class Deadlock {
    public static void main(String[] args) {
        String pensil = "Карандаш";
        String paper = "Бумага";

        Runnable friend1 = () -> {
            synchronized (pensil) {
                System.out.println("Друг 1 захватил карадаш");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Друг 2 ждёт карадаш");
                synchronized (paper) {
                    System.out.println("Друг 1 может писать");
                }
            }
        };

        Runnable friend2 = () -> {
            synchronized (paper) {
                System.out.println("Друг 2 захватил бумагу");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Друг 1 ждёт бумагу");
                synchronized (pensil) {
                    System.out.println("Друг 2 может писать");
                }
            }
        };

        Thread thread1 = new Thread(friend1);
        Thread thread2 = new Thread(friend2);

        thread1.start();
        thread2.start();
    }
}
