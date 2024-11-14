package Multithreading.P5.Eg2;

public class Launch {
    public static void main(String[] args) {
        Resource resource  = new Resource();
        User u1 = new User(resource);
        User u2 = new User(resource);
        u1.setName("User1");
        u2.setName("User2");
        u1.start();
        u2.start();
    }
}
