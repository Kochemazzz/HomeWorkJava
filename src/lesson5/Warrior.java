package lesson5;
import lesson4.Warior;

import static java.lang.Thread.sleep;
public class Warrior implements Runnable{
    public  Warrior enemy;
    public volatile int hp = 100;
    public void whoEnemy(Warrior warior){
        this.enemy = warior;
    }
    private void attack(Warrior warior){
        warior.setHp(warior.getHp()-20);

    }

    @Override
    public void run() {
        synchronized (enemy) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            attack(enemy);
        }
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
}
