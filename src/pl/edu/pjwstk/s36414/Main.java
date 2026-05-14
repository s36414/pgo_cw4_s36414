package pl.edu.pjwstk.s36414;

public class Main {
    static void main(String[] args) {
        ProjectTeam team = new ProjectTeam("Campus App");

        Employee e1 = new Developer("E-101", "Anna", "Maj", 12000.0, "Java", 4);
        Employee e2 = new Tester("E-201", "Piotr", "Lis", 9800.0, true, 25);
        Employee e3 = new Developer("E-102", "Karol", "Wojcik", 11500.0, "Kotlin", 3);

        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);

        team.printTeamMembers();
        System.out.println("Total team cost: " + team.calculateTotalCost());

        System.out.println(e1.introduce());
        System.out.println(e2.introduce());

        if (e1 instanceof Developer) {
            Developer developer = (Developer) e1;
            developer.printTechnologies();
        }

        System.out.println(e2.equals(new Tester("E-201", "Other", "Data", 9000.0, false, 10)));
        System.out.println(e2);
    }
}
