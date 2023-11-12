package lesson7;
import java.util.OptionalInt;
//1. Создайте класс Person с полями, необходимыми для хранения данных, указанных в условии.
public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;
    //...
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    //2. Наполните класс Person методами, нужными для реализации
    // поведения объектов этого класса как описано выше в условии.
    //...
    public boolean hasAge() {
        if (age == 0) {
            return false;
        } else {
            return true;
        }
    }
    //
    public boolean hasAddress() {
        if (address == null) {
            return false;
        } else {
            return true;
        }
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return this.address;
    }
    //
    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        age++;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setSurname(this.surname);
        System.out.println("Fork is done");
        return personBuilder;
    }
}

