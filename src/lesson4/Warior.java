package lesson4;
import static java.lang.Thread.sleep;
public class Warior implements Runnable {
    public Warior enemy;
    public int hp = 100;
    public void attack(Warior warior) throws InterruptedException {
        if(warior.getHp()<=0){
            System.out.println("Победил воин" + this.toString());
            return;
        }
        sleep(500);
        System.out.println("Воин" + this.toString() + " атакует " + " война " + warior.toString());
        int draftHp = warior.getHp();
        sleep(500);
        warior.setHp(draftHp - 20);
        sleep(500);
        System.out.println("У война " + warior.toString() + " осталось жизней: " + warior.getHp());
        sleep(500);
    }
    @Override
    public void run() {
        try {
            attack(enemy);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void whoEnemy(Warior warior){
        this.enemy = warior;
    }
}
