import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons;
//
//        persons.add(new Person("bob", "bob@email.com"));
//        persons.add(new Person("ben", "ben@email.com"));
//        persons.add(new Person("pam", "pam@email.com"));
//        persons.add(new Person("eve", "eve@email.com"));
//        persons.add(new Person("guy", "guy@email.com"));
//        persons.add(new Person("lis", "lis@email.com"));
//        persons.add(new Person("ann", "ann@email.com"));
//        System.out.println(persons);
//        Storage.save(persons);

        persons = Storage.fetchPersons();
        System.out.println(persons);
    }
}