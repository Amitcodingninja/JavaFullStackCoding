package Multithreading.P2;

public class Five extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "Five");
        if (name.equalsIgnoreCase("Amit")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(5 * i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}