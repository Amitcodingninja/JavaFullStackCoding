package Multithreading.P3.OneClassOneThread;

public class Seven implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "Seven ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(7 * i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
