package lesson10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        HybridArrayList hello = new HybridArrayList();
        System.out.println(hello.isEmpty());
        hello.add(new Object());
        hello.add(new Object());
        Object c = new Object();
        hello.add(c);
        for (Object o : hello) {
            System.out.println(o);
        }

        hello.remove(c);

        for (Object o : hello) {
            System.out.println(o);

        }
        hello.clear();
        System.out.println(hello.isEmpty());
        System.out.println(hello);
        for (Object o : hello) {
            System.out.println("------");
            System.out.println(o);
        }

    }
}
