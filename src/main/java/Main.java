public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("�����")
                .setSurName("�������")
                .setAge(18)
                .build();
        mom.setAddress("�����-���������, ������� ��-�� �5,");
        if (mom.age >= 18) {
            Person son = mom.newChildBuilder()
                    .setName("Max")
                    .build();
            son.happyBirthday();
            son.setAddress("�����-���������, ��-�� �������� �.5");
            System.out.println("� " + mom + " ���� ���, " + son);
        }else {
            System.out.println("� " + mom + " ���� ����� ���");
        }
        Person person1 = new Person("Vasya", "Petrov");
        Person person2 = new Person("Masha", "Zaharova", 23);
        Person person3 = new Person("Klava", "Shirokova", 35, "MSK");
    }


}
