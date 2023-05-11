public class PersonBuilder {
    protected String name;
    protected String surName;
    protected int age;
    protected String location;

    public PersonBuilder() {
        super();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        if(age < 0 || age >= 110){
            throw new IllegalArgumentException("Не верно указан возраст");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.location = address;
        return this;
    }
    public Person build(){
        if(name == null || surName == null){
            throw new IllegalStateException("Не верно указаны данные");
        }
        return new Person(this);
    }
}
