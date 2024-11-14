package Multithreading.JoinDemo;

public class Database1 extends Thread {
    public String collect[] = new String[4];

    public void run() {
        String data[] = {"d1", "d2", "d3", "d4"};
        int i = 0;
        for (String d : data) {
            collect[i] = d;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Data " + i + "Collect from DB1");
            i++;
        }
    }
}
