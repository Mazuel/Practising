package fi.masa.harjoittelua.henkilorekisteri;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.mysql.jdbc.Connection;

public class PersonalDataRegister {

    public static void main(String[] args) throws SQLException {
        MysqlConnect connector = new MysqlConnect();
        Connection connectionToDatabase = connector.connect();
        PersonManager personManager = new PersonManager();
        LinkedList<Person> linklist = new LinkedList<Person>();
        DataManager dataRetriever = new DataManager();
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        String answer = "";

        // linklist.add(new Person("Janne", "Louhitie", 2900, 18));
        // linklist.add(new Person("Lucifer", "Helvetti", 666666, 666));
        // linklist.add(new Person("Keijo", "Hessulaaksontie", 5300, 53));
        // linklist.add(new Person("Gilbert", "Raitislaaksonkatu 3", 9330, 26));
        // linklist.add(new Person("Mäyrä", "Ränkitie 10 B A", 100000, 7));

        while (!"6".equalsIgnoreCase(answer)) {
            menu.showMenu();
            answer = scan.nextLine();
            if (menu.addPerson(answer)) {
                
                dataRetriever.insertPerson();
//                try {
//                    Person a1 = personManager.addName();
//                    linklist.add(a1);
//
//                } catch (Exception e) {
//                    System.out.println("You must insert a number!");
//                }

            } else if (menu.removePerson(answer)) {
                int id = personManager.removeName();
                if (id <= linklist.size()) {
                    linklist.remove(id);
                } else {
                    System.out.println("That id does not exist!");
                }

            } else if (menu.printSelected(answer)) {
                System.out.print("Enter a letter you want to search for: ");
                String letter = scan.nextLine();

                System.out.println("Whose data do you want to print?");
                List<Person> filteredList = getPersons(person -> person.getName().contains(letter), linklist);

                String name = scan.nextLine();
                getPersons(person -> person.getName().equalsIgnoreCase(name), filteredList)
                        .forEach(System.out::println);

            } else if (menu.calculateAllWages(answer)) {
                int totalWage = linklist.stream().map(Person::getWage).reduce(0, (a, b) -> a + b);
                System.out.println("Total wage costs: " + totalWage + " euros.");

            } else if (menu.printAll(answer)) {
                dataRetriever.retrieveAll();
                // linklist.stream().forEach(System.out::println);
            } else if (answer.equalsIgnoreCase("6")) {

                System.out.println("Goodbye");
            } else {
                System.out.println("Unknown command, enter a number 1-6");
            }

        }
        scan.close();
        connector.disconnect();

    }

    private static List<Person> getPersons(Predicate<Person> personFilter, List<Person> linklist) {
        return linklist.stream().filter(personFilter).peek(person -> System.out.println(person.getName()))
                .collect(Collectors.toList());
    }
}
