package pl.edu.pjwstk.s36414;

public class Main {
    public static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("Campus App");

        Employee e1 = new Developer("E-101", "Anna", "Maj", 12000, "Java", 4);
        Employee e2 = new Tester("E-201", "Piotr", "Lis", 9800, true, 25);
        Employee e3 = new Developer("E-102", "Karol", "Wojcik", 11500, "Kotlin", 3);

        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);

        System.out.println("Team members:");
        team.printTeamMembers();

        System.out.println("Testers in team:");
        team.printTesters();

        System.out.println("Developers in team:");
        team.printDevelopers();

        System.out.println("Total team cost: " + team.calculateTotalCost());

        System.out.println(e1.introduce());
        System.out.println(e2.introduce());

        if (e1 instanceof Developer) {
            Developer developer = (Developer) e1;
            System.out.println(developer.introduce());
            developer.printTechnologies();
        }

        Employee newTester = new Tester("E-201", "Other", "Data", 9000, false, 10);

        System.out.println("New tester:");
        System.out.println(newTester.introduce());

        System.out.println("Old tester:");
        System.out.println(e2.introduce());

        System.out.println("Check if new tester is the same as old one:");
        System.out.println(e2.equals(newTester));

        String id = "E-101";
        System.out.println("Find employee by id: " + id);
        Employee employee = team.findById(id);
        if (employee != null) {
            System.out.println(employee.introduce());
        } else {
            System.out.printf("Employee (id=%s) NOT FOUND%n", id);
        }


    }
}
