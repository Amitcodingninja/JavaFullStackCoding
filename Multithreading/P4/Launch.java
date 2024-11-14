package Multithreading.P4;
// Synchronized Key word in java

public class Launch {
    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        Card card1 = new Card(account);
        Card card2 = new Card(account);
        card1.setName("CARD1");
        card1.setName("CARD2");

        card1.start();
        card2.start();
        card1.join();
        card2.join();

        account.get();
    }
}
