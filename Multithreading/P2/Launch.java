package Multithreading.P2;

public class Launch {
    public static void main(String[] args) {
        Seven s = new Seven(); // Thread Constructor
        Five f = new Five();

        f.setName("Amit ");
        s.setName("Pooja ");
        s.start();// Thread created and registered
        f.start();
    }
}
