package Lab7.challenge2;

public class BankAccount {
    private double debit;
    private String name;

    public BankAccount(String name, double debit) {
        this.debit = debit;
        this.name = name;
    }

    public  void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if (debit >= amount) {
            this.debit -= amount;
            System.out.println("new amount after withdraw: " + debit);
        } else {
            throw new InsufficientFundsException();
        }
    }

    public  void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
        System.out.println("new amount: " + debit);
    }

    private void longDatabaseCall() {try {
        Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
