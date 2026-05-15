package pl.edu.pjwstk.s36414;

public class Tester implements Employee {
    private final String id;
    private final String name;
    private final String surname;
    private final float wages;
    private final boolean automated;
    private final int scenariosNumer;

    public Tester(String id, String name, String surname, float wages, boolean automated, int scenariosNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wages = wages;
        this.automated = automated;
        this.scenariosNumer = scenariosNumber;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public float getWages() {
        return wages;
    }

    @Override
    public String introduce() {
        return toString();
    }

    @Override
    public String toString() {
        return "Tester[%s] %s %s; Automated - %b".formatted(id, name, surname, automated);
    }
}
