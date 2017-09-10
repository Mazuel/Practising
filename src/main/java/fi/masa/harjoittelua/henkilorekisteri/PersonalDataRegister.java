package fi.masa.harjoittelua.henkilorekisteri;

import java.util.LinkedList;
import java.util.Scanner;

public class PersonalDataRegister {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        LinkedList<Person> linklist = new LinkedList<Person>();
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        String answer = "";

        linklist.add(new Person("Janne", "Louhitie", 2900, 18));
        linklist.add(new Person("Lucifer", "Helvetti", 666666, 666));
        linklist.add(new Person("Keijo", "Hessulaaksontie", 5300, 53));
        linklist.add(new Person("Gilbert", "Raitislaaksonkatu 3", 9330, 26));
        linklist.add(new Person("Mäyrä", "Ränkitie 10 B A", 100000, 7));
        while (!"5".equalsIgnoreCase(answer)) {
            menu.showMenu();
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("1")) {
                try {
                    Person a1 = personManager.addName();
                    linklist.add(a1);

                } catch (Exception e) {
                    System.out.println("You must insert a number!");
                }

            } else if (answer.equalsIgnoreCase("2")) {
                int id = personManager.removeName();
                if (id <= linklist.size()) {
                    linklist.remove(id);
                } else {
                    System.out.println("That id does not exist!");
                }

            } else if (menu.printSelected(answer)) {
                for (Person person : linklist) {
                    System.out.println(person.getName());
                    
                }
            } else if (answer.equalsIgnoreCase("4")) {
                linklist.stream().forEach(System.out::println);
            } else if (answer.equalsIgnoreCase("5")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Unknown command, enter a number 1-5");
            }

        }
        scan.close();

    }
}
