package lesson8;
public class Main {
    public static void main(String[] args) {
        Musician musician1 = new Musician(new Guitar());
        musician1.startPlay();
        musician1.setInstrument(new Piano());
        musician1.startPlay();

    }
}
