package com.lambton;

import com.lambton.customException.InValidNameException;
import com.lambton.vehicle.Vehicle;

public abstract class Person implements IDisplay {


    int id;
    String firstname;
    String lastname;
    Gender gender;
    Vehicle vehicle;

    public Person(int id, String firstname, String lastname, Gender gender, Vehicle vehicle) throws InValidNameException {
        this.id = id;

        if(InValidNameException.validateFirstName(firstname)){
            this.firstname = firstname;
        }else{
            throw new InValidNameException("Length of first name must be greater than 5");
        }

        this.lastname = lastname;
        this.gender = gender;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) throws InValidNameException {
       if(InValidNameException.validateFirstName(firstname)){
            this.firstname = firstname;
        }else{
            throw new InValidNameException("Invalid first name:" + firstname);
       }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract String getType();
}
