package Tema9package.Exercises2and3;

import java.time.LocalDate;

public class Programmer extends Employee{

    private static final String position = "programmer";
    private final String language;



    public Programmer(String getFirstName, String getLastName, String getBirthday, String getAdress, String dateOfEmployment, String language) {
        super(getFirstName, getLastName, getBirthday, getAdress, dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
