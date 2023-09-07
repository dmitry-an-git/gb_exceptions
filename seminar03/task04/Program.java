package gb_exceptions.seminar03.task04;

public class Program {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.newAccount(1, 1000);
        bank.newAccount(2, 990);

        bank.deposit(1, 500);
        bank.withdraw(2, 500);
        bank.withdraw(2, 100);
        bank.withdraw(2, 1000);
    }
}
