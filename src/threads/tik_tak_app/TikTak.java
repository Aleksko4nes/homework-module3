package threads.tik_tak_app;

public class TikTak {
    private static final Object lock = new Object();
    private static boolean printOne = true;

    public static void main(String[] args) {
        Runnable thread1 = () -> {
            while (true) {
                synchronized (lock) {
                    while (!printOne) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("1");
                    printOne = false;
                    lock.notify();
                }
            }
        };
        Runnable thread2 = () -> {
            while (true) {
                synchronized (lock) {
                    while (printOne) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println("2");
                    printOne = true;
                    lock.notify();
                }
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}
