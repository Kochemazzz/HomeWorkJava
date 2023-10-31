package lesson1;
import lesson3.ServiceAccount;

import java.util.ArrayList;
import java.util.List;
public class ServiceAirplane {
    private ServiceAirplane(){}
    public static double costAndGas(Airplane airplane) {
        double cost = (100 - airplane.getFuel()) * 56;
        airplane.setFuel(100);
        System.out.println("Цена за заправку составила - " + cost);
        return cost;
    }
    public static String utilization(Airplane airplane, int year) {
        if (year - airplane.getYear() >= 30) {
            return "Самолет пора в утиль";
        }
        return "Самолет еще полетает";
    }
    public static  int veryWeight(List<Airplane> airplanes) {
        List<Airplane> draft = new ArrayList<>();
        for (Airplane airplane : airplanes) {
            if (airplane.getWeight() > 50) {
                draft.add(airplane);
            }
        }
        System.out.println("Кол-во самолетов больше 55 тонн: " + draft.size());
        return draft.size();
    }
}
