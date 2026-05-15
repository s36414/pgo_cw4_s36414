package pl.edu.pjwstk.s36414;

import java.util.Objects;

public class Tester extends Employee {
    private final boolean automated;
    private final int scenariosNumber;

    public Tester(String id, String name, String surname, float wages, boolean automated, int scenariosNumber) {
        super(id, name, surname, wages);
        this.automated = automated;
        this.scenariosNumber = scenariosNumber;
    }

    @Override
    public String introduce() {
        return "Tester[%s] %s %s; Automated - %b".formatted(id, name, surname, automated);
    }

    public void generateTestReport() {
        System.out.printf("Tests report: Scenarios tested - %d", scenariosNumber);
    }

    public int getScenariosNumber() {
        return scenariosNumber;
    }

    public boolean isAutomated() {
        return automated;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "automated=" + automated +
                ", scenariosNumer=" + scenariosNumber +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tester tester)) return false;
        if (!super.equals(o)) return false;
        return automated == tester.automated && scenariosNumber == tester.scenariosNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(automated, scenariosNumber);
    }
}
