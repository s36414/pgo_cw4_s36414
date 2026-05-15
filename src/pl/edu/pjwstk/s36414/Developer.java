package pl.edu.pjwstk.s36414;

public class Developer implements Employee {
    private final String id;
    private final String name;
    private final String surname;
    private final float wages;
    private final String mainLanguage;
    private final int repositoriesNumber;

    public Developer(String id, String name, String surname, float wages, String mainLanguage, int repositoriesNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wages = wages;
        this.mainLanguage = mainLanguage;
        this.repositoriesNumber = repositoriesNumber;
    }

    public void printTechnologies() {
        System.out.println(mainLanguage);
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
        return "Developer[%s] %s %s; Main language - %s".formatted(id, name, surname, mainLanguage);
    }
}
