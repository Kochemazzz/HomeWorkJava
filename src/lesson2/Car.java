package lesson2;
public class Car {
    private String model;
    private Engine engine;
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    public void startMove(int km){
        int state = (int) (engine.getDurability() - (km*0.01));
        engine.setDurability(state);
    }
    public void showEngineInfo(){
        System.out.println("Состояние двигателя составляет: " + engine.getDurability());
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
