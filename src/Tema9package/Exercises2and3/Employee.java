package Tema9package.Exercises2and3;

import java.time.LocalDate;

public class Employee implements Person{

    private final String dateOfEmployment;
    private final String position;

    public String fullName;



    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public String getBirthday() {
        return "";
    }

    @Override
    public String getAdress() {
        return "";
    }

    public Employee(String getFirstName, String getLastName, String getBirthday, String getAdress, String dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        fullName = getFirstName + " " + getLastName;
    }

    public void getFullName() {
        System.out.println("The complete name of this employee is: " + fullName);
    }
}
