package Tema9package.Exercises2and3;

import java.time.LocalDate;

public class Programmer extends Employee{

    private static final String position = "programmer";
    private final String language;


    public Programmer(String firstName, String lastName, String birthday, String adress, String dateOfEmployment, String language) {
        super(firstName, lastName, birthday, adress, dateOfEmployment, position);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }

    public String getLanguage() {
        return language;
    }

}
