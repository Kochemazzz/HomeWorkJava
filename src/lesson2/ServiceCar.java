package lesson2;
import java.util.List;
public class ServiceCar {
    private Car car;
    public ServiceCar(Car car) {
        this.car = car;
    }
    public void repairEngine(){
        car.setEngine(new Engine(100));
        System.out.println("Ваш двигатель восстановлен");
    }
    public Car repairEngine(List<Car> listCar){
        int min = 100;
        Car newCar = null;
        for (Car car1 : listCar) {
            if(car1.getEngine().getDurability() < min){
                newCar = car1;
                min = car1.getEngine().getDurability();
            }
        }
        System.out.println("Самый плохой двигатель " + newCar.toString() + "с износом: " + min);
        return newCar;
    }
}
