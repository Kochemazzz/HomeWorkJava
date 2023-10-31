package lesson3;
public class BillException extends ArithmeticException{
    public BillException() {
        System.out.println("Ошибка счета");
    }
}
