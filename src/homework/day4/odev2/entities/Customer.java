package homework.day4.odev2.entities;

import homework.day4.odev2.abstracts.IEntity;

import java.util.Date;

public class Customer implements IEntity {

    private int id;
    private String FirstName;
    private String LastName;
    private int DateOfBirth;
    private String nationalityId;


    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }



}
