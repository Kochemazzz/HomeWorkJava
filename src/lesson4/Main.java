package lesson4;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Warior warior = new Warior();
        Warior warior1 = new Warior();
        for (int i = 0; i < 10; i++) {
            warior.attack(warior1);
            if (warior1.getHp() == 0) {
                System.out.println("Победил воин" + warior1.toString());
                return;
            }
            if (warior.getHp() == 0) {
                System.out.println("Победил воин" + warior.toString());
                return;
            }
            warior1.attack(warior);
            if (warior1.getHp() == 0) {
                System.out.println("Победил воин" + warior1.toString());
                return;
            }
            if (warior.getHp() == 0) {
                System.out.println("Победил воин" + warior.toString());
                return;
            }
        }
    }
}
