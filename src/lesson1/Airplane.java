package lesson1;
public class Airplane {
    private String producer;
    private int year;
    private int length;
    private double weight;
    private double fuel = 100;
    public Airplane(String producer, int year, int length, double weight, double fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }
    public Airplane(String producer, int year, int length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void info() {
        System.out.println("Изготовитель: " + getProducer() + ", год выпуска: " + getYear() +", длина: " + getLength() + ", вес: " + getWeight() + ", количество топлива в баке: " +  getFuel());
    }
    public String getProducer() {
        return this.producer;
    }
    public int getYear() {
        return this.year;
    }
    public int getLength() {
        return this.length;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getFuel() {
        return this.fuel;
    }
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
