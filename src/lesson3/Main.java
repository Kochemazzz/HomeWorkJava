package lesson3;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(121414, "Iurii", 241424.22, true);
        BankAccount bankAccount1 = new BankAccount(121414, "Vasya", 2100, false);
        BankAccount bankAccount2 = new BankAccount(121414, "MAsha", 2300, false);
        List<BankAccount> bankAccounts = new ArrayList<>();
        List<BankAccount> isNoActiveAccounts = new ArrayList<>();
        bankAccounts.add(bankAccount);
        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);

        ServiceAccount.searchAccount(bankAccounts,121414);
    }
}

