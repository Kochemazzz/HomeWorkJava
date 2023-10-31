package lesson3;
import java.util.ArrayList;
import java.util.List;
public class ServiceAccount {
    private ServiceAccount() {
    }
    public static void transferAccount(BankAccount bankAccountFirst, BankAccount bankAccountSecond) {
        if (bankAccountFirst.getIsActive() && bankAccountSecond.getIsActive() && (bankAccountFirst.getAmmount() > 0)) {
            String transferName = bankAccountFirst.getName();
            double transferAmmount = bankAccountFirst.getAmmount();
            boolean transferIsActive = bankAccountFirst.getIsActive();
            bankAccountSecond.setName(transferName);
            bankAccountSecond.setAmmount(transferAmmount);
            bankAccountSecond.setIsActive(transferIsActive);
            System.out.println(bankAccountSecond.getAmmount());
        } else {
            throw new BillException();
        }
    }
    public static List<BankAccount> returnActiveAccounts(List<BankAccount> bankAccounts) {
        List<BankAccount> draft = new ArrayList<>();
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getIsActive() != true) {
                draft.add(bankAccount);
            }
        }
        return draft;
    }
    public static List<BankAccount> searchAccount(List<BankAccount> bankAccounts, int id) {
        List<BankAccount> draft = new ArrayList<>();
        for (BankAccount bankAccount : bankAccounts) {
            if (id == bankAccount.getId()) {
                draft.add(bankAccount);
            }
        }
        System.out.println("Мы нашли эти счета: " + draft);
        return draft;
    }
}
