package Multithreading.P5.Eg2;

public class Resource {
    public synchronized void  printer(String name)
    {
        for (int i =0; i<10; i++)
        {
            System.out.println(name + " Using Printer");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
