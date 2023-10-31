package lesson4;
public class MainThreads {
    public static void main(String[] args) {
        Warior warior1 = new Warior();
        Warior warior2 = new Warior();
        warior1.whoEnemy(warior2);
        warior2.whoEnemy(warior1);
        for (int i = 0; i < 100; i++) {
            new Thread(warior1).start();
            new Thread(warior2).start();
        }
    }

}
