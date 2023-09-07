package gb_exceptions.seminar03.task04;

public class BankAccount {
    public int number;
    public int balance;

    public BankAccount(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void deposit(int ammount) {
        this.balance = balance + ammount;
    }

    public void withdraw(int ammount) throws InsufficientFundsException{
        if (ammount > balance) {
            throw new InsufficientFundsException("Недостаточно средств");
        } 
        this.balance = balance - ammount;
    }
}
