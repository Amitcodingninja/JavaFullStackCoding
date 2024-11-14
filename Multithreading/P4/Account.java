package Multithreading.P4;

public class Account extends Thread {
    private int bal = 500000;

    public synchronized void  deduct(int bal, String cardName) {
        this.bal = this.bal - bal;
        System.out.println("Debit Successfully" + cardName);
    }

    public void get() {
        System.out.println(bal);
    }
}
