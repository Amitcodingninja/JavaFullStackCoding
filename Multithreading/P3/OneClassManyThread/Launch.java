package Multithreading.P3.OneClassManyThread;
//Program: ONE CLASS MULTIPLE THREAD (Runnable Interface)
//The program uses a single class (Table) with multiple threads,
// each identified by a unique name to determine which task to execute.
// This demonstrates how to run different tasks using the same Runnable class in a multithreaded environment.
public class Launch {
    public static void main(String[] args) {
        Runnable r1 = new Table();
        Runnable r2 = new Table();
        Runnable r3 = new Table();

        Thread t1 = new Thread(r1,"raju");
        Thread t2 = new Thread(r2,"kaju");
        Thread t3 = new Thread(r3,"maju");

        t1.start();
        t2.start();
        t3.start();

    }
}
