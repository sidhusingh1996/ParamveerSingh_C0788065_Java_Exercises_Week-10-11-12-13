package com.lambton.student;

import com.lambton.Gender;
import com.lambton.customException.InValidNameException;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Student{

    int noWeeklyClasses;
    public FullTime(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) throws InValidNameException {
        super(id, firstname, lastname, gender, vehicle, collegeName, courseName, result);

        this.noWeeklyClasses = noWeeklyClasses;
    }

    public int getNoWeeklyClasses() {
        return noWeeklyClasses;
    }

    public void setNoWeeklyClasses(int noWeeklyClasses) {
        this.noWeeklyClasses = noWeeklyClasses;
    }

    @Override
    public String getType() {
        return "Full Time Student";
    }

    @Override
    public String display() {
        System.out.println("Student Id :" + this.getId());
        System.out.println("Student First Name :" + this.getFirstname());
        System.out.println("Student Last Name :" + this.getLastname());
        System.out.println("Student Gender :" + this.getGender());
        System.out.println("Student College Name :" + this.getCollegeName());
        System.out.println("Student Course Name :" + this.getCourseName());
        System.out.println("Student Result :" + this.getResult());
        System.out.println("Number of hours weekly :" + this.noWeeklyClasses);

        if (this.getVehicle() == null) {
            System.out.println("Student do not have vehicle");
        } else {
            this.getVehicle().display();
        }
        return null;
    }
}
