package lesson1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Russia", 1992,12,51,50);
        Airplane airplane2 = new Airplane("Russia", 1972,12,55,70);
        Airplane airplane3 = new Airplane("Russia", 1962,12,40,80);
        Airplane airplane4 = new Airplane("Russia", 2021,12,60,99);
        airplane1.info();
        ServiceAirplane.costAndGas(airplane1);
        System.out.println(ServiceAirplane.utilization(airplane1,2023));
        List <Airplane> airplanes = new ArrayList<>();
        airplanes.add(airplane1);
        airplanes.add(airplane2);
        airplanes.add(airplane3);
        airplanes.add(airplane4);
        ServiceAirplane.veryWeight(airplanes);


    }
}
