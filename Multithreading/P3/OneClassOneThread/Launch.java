package Multithreading.P3.OneClassOneThread;
//Program: ONE CLASS ONE THREAD
// (Runnable Interface)
//Yeh program do alag tasks (`Five` aur `Seven` classes ke `Runnable` objects) ko alag-alag threads (`t1` aur `t2`) mein parallel execute karta hai,
//jisse dono tasks simultaneously chal sakein.

public class Launch {
    public static void main(String[] args) {
        Runnable five = new Five();
        Runnable seven = new Seven();
        Thread t1 = new Thread(five);
        Thread t2 = new Thread(seven);

        t1.start();
        t2.start();
    }
}
