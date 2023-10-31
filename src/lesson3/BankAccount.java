package lesson3;
public class BankAccount {
    private int id;
    private String name;
    private double ammount;
    private boolean isActive;
    public BankAccount() {
    }
    public BankAccount(int id, String name, double ammount, boolean isActive) {
        this.id = id;
        this.name = name;
        this.ammount = ammount;
        this.isActive = isActive;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmmount() {
        return this.ammount;
    }
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
    public boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getId(){
        return id;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ammount=" + ammount +
                ", isActive=" + isActive +
                '}';
    }
}
