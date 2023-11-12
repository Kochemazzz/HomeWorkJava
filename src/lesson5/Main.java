package lesson5;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;
public class Main {

    public static void main(String[] args) {
        Warrior warior = new Warrior();
        Warrior warior1 = new Warrior();
        warior.whoEnemy(warior1);
        warior1.whoEnemy(warior);
        for (int i = 0; i < 10 ; i++) {
            if(warior.getHp() <= 0){
                System.out.println("win " + warior1.toString());
                break;
            }
            if(warior1.getHp() <=0){
                System.out.println("win " + warior.toString());
                break;
            }
            try {
                sleep(500);
                new Thread(warior).start();
                sleep(500);
                new Thread(warior1).start();
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
