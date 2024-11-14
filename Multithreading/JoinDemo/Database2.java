package Multithreading.JoinDemo;

public class Database2 extends Thread{
    public String collect[] = new String[4];
    public void run()
    {
        String data [] = {"xd1","xd2","xd3","xd4"};
        int i = 0;
        for (String d : data)
        {
            collect[i]= d;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Data " +i+"Collected from DB2 ");
            i++;
        }
    }

}
