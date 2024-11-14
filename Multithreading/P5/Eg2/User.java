package Multithreading.P5.Eg2;

public class User extends Thread {
    public Resource resource;
    // Resource mai constructor

    public User(Resource resource) {
        this.resource = resource;

    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        resource.printer(getName());
    }
}
