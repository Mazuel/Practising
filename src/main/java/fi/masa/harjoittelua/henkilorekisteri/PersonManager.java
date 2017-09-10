package fi.masa.harjoittelua.henkilorekisteri;

import fi.masa.harjoittelua.KonsoliLukija;

public class PersonManager {
    private KonsoliLukija reader = new KonsoliLukija();
    public Person a1;

    public Person addName() {

        System.out.print("Enter new name: ");
        String name = reader.read();
        Person a1 = new Person(name);
        System.out.print("Age: ");
        int age = Integer.parseInt(reader.read());
        a1.setAge(age);
        System.out.print("Address: ");
        String address = reader.read();
        a1.setAddress(address);
        System.out.print("Wage: ");
        int wage = Integer.parseInt(reader.read());
        a1.setWage(wage);
        return a1;

    }

    public int removeName() {
        while (true) {

            System.out.println("Enter the id of the person you want to remove: ");
            int id = Integer.parseInt(reader.read());
            System.out.println("Are you sure you want to remove id: " + id + "?");
            String answer2 = reader.read();
            if (answer2.equalsIgnoreCase("yes")) {
                return id;
            }
        }

    }

}
