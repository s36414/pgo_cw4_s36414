package pl.edu.pjwstk.s36414;

import java.util.Objects;

public class Developer extends Employee {
    private final String mainLanguage;
    private final int repositoriesNumber;

    public Developer(String id, String name, String surname, float wages, String mainLanguage, int repositoriesNumber) {
        super(id, name, surname, wages);
        this.mainLanguage = mainLanguage;
        this.repositoriesNumber = repositoriesNumber;
    }

    public void printTechnologies() {
        System.out.println(mainLanguage);
    }

    @Override
    public String introduce() {
        return "Developer[%s] %s %s; Main language - %s".formatted(id, name, surname, mainLanguage);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "mainLanguage='" + mainLanguage + '\'' +
                ", repositoriesNumber=" + repositoriesNumber +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Developer developer)) return false;
        if (!super.equals(o)) return false;
        return repositoriesNumber == developer.repositoriesNumber && Objects.equals(mainLanguage, developer.mainLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, getWages(), mainLanguage, repositoriesNumber);
    }
}
