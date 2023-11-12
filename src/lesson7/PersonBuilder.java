package lesson7;
/*3. Создайте класс PersonBuilder, наполните его полями для данных
  будущего объекта класса Person и методами их наполняющими (не забудьте про IllegalArgumentException в
  случае ввода недопустимых данных)
   */
public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;
    //...
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public int getAge() {
        return this.age;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public Person build() {
        Person person = new Person(name, surname, age, address);
        if(age <0){
            throw  new IllegalStateException("Age can't minus");
        }
        if ((name == null || surname == null)) {
            throw  new IllegalStateException("Not enough fields");

        } else {
            System.out.println("Object of Person is done");
            return person;
        }
    }
}
