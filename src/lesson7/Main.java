package lesson7;
//5. Добавьте класс Main для демонстрации
public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Мария")
                .setSurname("Иванова")
                .setAge(31)
                .setAddress("Moscow")
                .build();
        mom.happyBirthday();
        System.out.println(mom.getAge());
        System.out.println(mom.getName());
        System.out.println(mom.getSurname());
        System.out.println(mom.getAddress());
        System.out.println(mom.hasAddress());
        System.out.println(mom.hasAge());
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);
//
        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

