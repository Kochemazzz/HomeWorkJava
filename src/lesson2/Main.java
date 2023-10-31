package lesson2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(100);
        Engine engine1 = new Engine(40);
        Engine engine2 = new Engine(10);
        Car car = new Car("Porshe", engine);
        Car car1 = new Car("Lada", engine1);
        Car car2 = new Car("Bently", engine2);
        List<Car> cars = new ArrayList<>();
        cars.add(car2);
        cars.add(car1);
        cars.add(car);
        car.startMove(100);
        car.showEngineInfo();
        ServiceCar serviceCar = new ServiceCar(car);
        serviceCar.repairEngine(cars);
        car.showEngineInfo();
    }
}
