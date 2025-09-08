package threads.livelock;

public class Livelock {
    public static void main(String[] args) {
        final boolean[] spoonTaken = {false};
        final boolean[] potTaken = {false};

        Thread thread1 = new Thread(() -> {
           while (true) {
               if (!spoonTaken[0]){
                   spoonTaken[0] = true;
                   System.out.println("thread 1 - took a spoon");
                   if (!potTaken[0]) {
                       potTaken[0] = true;
                       System.out.println("thread 1 - took a pot");
                       break;
                   } else {
                       System.out.println("Thread 1 - pot is taken");
                       spoonTaken[0] = false;
                       try {
                           Thread.sleep(100);
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
               }
           }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (!potTaken[0]){
                    potTaken[0] = true;
                    System.out.println("Tread 2 - took a pot");
                    if (!spoonTaken[0]) {
                        spoonTaken[0] = true;
                        System.out.println("tread 2 - took a spoon");
                        break;
                    } else {
                        System.out.println("tread 2 - spoon is taken");
                        potTaken[0] = false;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
