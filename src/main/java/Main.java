public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Мария")
                .setSurName("Иванова")
                .setAge(18)
                .build();
        mom.setAddress("Санкт-Петербург, Невский пр-кт д5,");
        if (mom.age >= 18) {
            Person son = mom.newChildBuilder()
                    .setName("Max")
                    .build();
            son.happyBirthday();
            son.setAddress("Санкт-Петербург, пр-кт Культуры д.5");
            System.out.println("У " + mom + " есть сын, " + son);
        }else {
            System.out.println("У " + mom + " пока детей нет");
        }
        Person person1 = new Person("Vasya", "Petrov");
        Person person2 = new Person("Masha", "Zaharova", 23);
        Person person3 = new Person("Klava", "Shirokova", 35, "MSK");
    }


}
