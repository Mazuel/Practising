package fi.masa.harjoittelua.henkilorekisteri;

public class Person {
    private String address;
    private String name;
    private int wage;
    private int age;
    public static int count = 0;
    public int id;

    public Person(String name) {
        id = count;
        count++;
        this.name = name;

    }

    public Person(String name, String address, int wage, int age) {
        id = count;
        count++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String toString() {
        return String.join(" : ", "Name: " + name, "Age: " + age, "ID: " + id, "Address: " + address, "Wage: " + wage);
    }
    public boolean equals(Object another) {
        return this.getName().equalsIgnoreCase(((Person)another).getName());
    }
}
