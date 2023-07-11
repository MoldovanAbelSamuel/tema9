package Tema9package.Exercises2and3;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{

    private String dbTechnology;



    public DatabaseAdmin(String getFirstName, String getLastName, String getBirthday, String getAdress, String dateOfEmployment, String position, String dbTechnology) {
        super(getFirstName, getLastName, getBirthday, getAdress, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAdress() {
        return "db admin: " + super.getAdress();
    }
}
