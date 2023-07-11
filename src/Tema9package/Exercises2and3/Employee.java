package Tema9package.Exercises2and3;

import java.time.LocalDate;

public class Employee implements Person{

    private final String dateOfEmployment;
    private final String position;

    private String FirstName;
    private String LastName;
    private String Birthday;
    private String Adress;

    public String fullName;



    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public Employee(String firstName, String lastName, String birthday, String adress, String dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        FirstName = firstName;
        LastName = lastName;
        Birthday = birthday;
        Adress = adress;
        fullName = FirstName + " " + LastName;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

    @Override
    public String getBirthday() {
        return Birthday;
    }

    @Override
    public String getAdress() {
        return Adress;
    }


    public void getfullName() {
        System.out.println("The complete name of this employee is: " + fullName);
    }
}
