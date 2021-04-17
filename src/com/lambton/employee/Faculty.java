package com.lambton.employee;

import com.lambton.Gender;
import com.lambton.customException.InValidNameException;
import com.lambton.customException.InValidSalaryException;
import com.lambton.vehicle.Vehicle;

public abstract class Faculty extends Employee{

    String department;

    public Faculty(int id, String firstname, String lastname, Gender gender, Vehicle vehicle, double totalSalary, String department) throws InValidSalaryException, InValidNameException {
        super(id, firstname, lastname, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
