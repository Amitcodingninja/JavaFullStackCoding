package Multithreading.P2;

public class Seven extends Thread {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "Seven");
        for (int i = 1; i <= 10; i++) {
            System.out.println(7 * i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
