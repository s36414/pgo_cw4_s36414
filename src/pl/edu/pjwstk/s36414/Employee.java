package pl.edu.pjwstk.s36414;

import java.util.Objects;

public class Employee {
    protected final String id;
    protected final String name;
    protected final String surname;
    private final float wages;

    public Employee(String id, String name, String surname, float wages) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wages = wages;
    }

    public final String getId() {
        return id;
    }

    public final float getWages() {
        return wages;
    }

    public String introduce() {
        return "Employee id=%s, name=%s, surname=%s, wages=%.2f".formatted(id, name, surname, wages);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wages=" + wages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;
        return Float.compare(wages, employee.wages) == 0 && Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, wages);
    }
}
