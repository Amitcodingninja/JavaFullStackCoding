package Multithreading.JoinDemo;

public class Launch {
    public static void main(String[] args) throws InterruptedException {
        Database1 database1 = new Database1();
        Database2 database2 = new Database2();

        // Priority 1-10
        database1.setPriority(Thread.MIN_PRIORITY);
        database2.setPriority(Thread.MAX_PRIORITY);

        database1.start();
        database2.start();


        database1.join();
        database2.join();
    }

    public static void process(String[] collect1, String[] collect2) {
        for (String d : collect1) {
            System.out.println(d);
        }
        for (String d : collect2) {
            System.out.println(d);
        }
    }
}
