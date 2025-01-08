import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        if (initialRole == null) {
            throw new NullPointerException("Initial role is null");
        }
        this.roles = new ArrayList<>();
        roles.add(initialRole);
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%s works in %s and have the role(s) of %s", name, department, roles);
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void removeRole(String roleName) {
        roles.removeIf(role -> role.getName().equals(roleName));
    }
}