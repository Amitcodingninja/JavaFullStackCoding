package Multithreading.P4;

public class Card extends Thread {
    private Account account;

    public Card(Account account) {
        this.account = account;

    }

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        for (int i = 1; i <= 100000; i++) {
            account.deduct(2, name);
        }
    }
}
