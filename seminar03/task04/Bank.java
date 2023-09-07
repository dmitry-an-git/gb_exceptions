package gb_exceptions.seminar03.task04;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<BankAccount>();
    }

    public void newAccount(int number, int balance) {
        BankAccount bankAccount = new BankAccount(number, balance);
        accounts.add(bankAccount);
        System.out.println("Account with number "+number+" created (initial balance "+balance+")" );
    }

    public void deposit(int accountNumber, int ammount) {
        boolean isFound = false;

        for (BankAccount bankAccount : accounts) {

            if (bankAccount.getNumber() == accountNumber) {
                isFound = true;
                bankAccount.deposit(ammount);
                System.out.println("Счет "+bankAccount.getNumber()+" пополнен на "+ammount+" баланс "+bankAccount.getBalance());
            } 
        }
        if (!isFound) {
                System.out.println("wrong account number");
        }

    }

    public void withdraw(int accountNumber, int ammount) {
        boolean isFound = false;

        for (BankAccount bankAccount : accounts) {
            
            if (bankAccount.getNumber() == accountNumber) {
                isFound = true;
                try {
                    bankAccount.withdraw(ammount);
                    System.out.println("Со счета "+bankAccount.getNumber()+" списано "+ammount+" баланс "+bankAccount.getBalance());
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            }  
        }

        if (!isFound) {
                System.out.println("wrong account number");
        }
        
    }


}
