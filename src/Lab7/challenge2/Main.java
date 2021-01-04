package Lab7.challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Ba1", 2000);
        BankAccount ba2 = new BankAccount("Ba2", 4000);
        BankAccount ba3 = new BankAccount("Ba3", 2400);

        TransactionThread tt =new TransactionThread("t1", ba1, ba2, 2000);
        TransactionThread tt2 =new TransactionThread("t2", ba1, ba3, 1900);

        tt.start();
        tt2.start();
    }
}
