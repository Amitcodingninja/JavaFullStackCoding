package Multithreading.P3.OneClassManyThread;
//Program: ONE CLASS MULTIPLE THREAD (Runnable Interface)
public class Table implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equalsIgnoreCase("Raju")) {

            try {
                five();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else if (name.equalsIgnoreCase("Kaju")) {
            seven();

        } else {
            eleven();
        }

    }

    public void five() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
            Thread.sleep(1000);
        }
    }

    public void seven() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(7 * i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void eleven() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(11*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}