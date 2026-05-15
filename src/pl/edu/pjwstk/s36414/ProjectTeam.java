package pl.edu.pjwstk.s36414;

import java.util.ArrayList;

public class ProjectTeam {
    private final String appName;
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public ProjectTeam(String appName) {
        this.appName = appName;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("Project team members:");
        for (Employee employee : employeeList) {
            System.out.println(employee.introduce());
        }
    }

    public String calculateTotalCost() {
        return employeeList.stream().map(employee -> employee.getWages()).reduce(0f, Float::sum).toString();
    }

    public void printTesters() {
        employeeList.stream()
                .filter(employee -> employee instanceof Tester)
                .forEach(employee -> System.out.println(employee.introduce()));
    }

    public void printDevelopers() {
        employeeList.stream()
                .filter(employee -> employee instanceof Developer)
                .forEach(employee -> System.out.println(employee.introduce()));
    }

    public Employee findById(String id) {
        return employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst().get();
    }
}
