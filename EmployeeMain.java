import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee bob = new Employee("Bob", "Sales", new Role("Manager"));
        Employee alice = new Employee("Alice", "Engineering", new Role("Engineer"));

        employees.add(bob);
        employees.add(alice);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        bob.addRole(new Role("Designer"));
        bob.addRole(new Role("Typesetter"));

        System.out.println(bob);

        bob.removeRole("Designer");

        System.out.println(bob);


    }
}
