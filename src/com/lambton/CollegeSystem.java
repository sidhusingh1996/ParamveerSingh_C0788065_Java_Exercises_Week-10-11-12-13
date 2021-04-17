package com.lambton;

import com.lambton.customException.InValidNameException;
import com.lambton.customException.InValidSalaryException;
import com.lambton.employee.Employee;
import com.lambton.employee.FullTime;
import com.lambton.employee.PartTime;
import com.lambton.student.Student;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.Color;

import java.util.ArrayList;


public class CollegeSystem {
    public static void main(String[] args) {

        ArrayList<Person> person  = new ArrayList<Person>();
        try{
            FullTime fullTimeEmployee = new FullTime(1 , "Amrit", "Bhullar", Gender.MALE , null , 5000, "HR" , 20);
            person.add(fullTimeEmployee);
        }catch (InValidSalaryException e){
             System.out.println(e);
        }catch (InValidNameException en){
            System.out.println(en);
        }

        try{
            FullTime fullTimeEmployee = new FullTime(1 , "Harman", "Sekhon", Gender.FEMALE , null , 500, "HR" , 20);
            person.add(fullTimeEmployee);
        }catch (InValidSalaryException e){
            System.out.println(e);
        }catch (InValidNameException en){
            System.out.println(en);
        }


        try{
            Car c1 = new Car(123 , "HYUNDAI" , true , Color.BLACK);
            PartTime partTimeEmployee = new PartTime( 2 , "Tajinder" , "Romana" , Gender.MALE , c1 , 2500 , "Account" ,20 , 15);
            person.add(partTimeEmployee);
        }catch (InValidSalaryException e){
            System.out.println(e);

        }catch (InValidNameException en){
            System.out.println(en);
        }

        try {
            com.lambton.student.FullTime fullTimeStudent = new com.lambton.student.FullTime(1, "Paramveer ", "Singh", Gender.MALE, null, "Lambton College", "CSAT", "A+", 20);
            person.add(fullTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }

        try{
            Car c2 = new Car(124 , "BMW" , true , Color.YELLOW);
            com.lambton.student.PartTime partTimeStudent = new com.lambton.student.PartTime(1 , "Rajveer", "Bhullar", Gender.FEMALE , c2, "Lambton College" ,"CSAT" , "A+" ,5);
            person.add(partTimeStudent);
        }catch (InValidNameException e){
            System.out.println(e);
        }

        for (Person p : person)
        {
            if(p instanceof Employee){
                System.out.println("-------------------- Employee ---------------");
                if (p instanceof FullTime) {
                    System.out.println("------------ Full Time Employee --------------");
                }
                if (p instanceof PartTime) {
                    System.out.println("------------ Part Time Employee --------------");
                }
            }

            if(p instanceof Student) {
                System.out.println("---------------- Student ---------------");
                if (p instanceof com.lambton.student.FullTime) {
                    System.out.println("------------ Full Time Student --------------");
                }
                if (p instanceof com.lambton.student.PartTime) {
                    System.out.println("------------ Part Time Student --------------");
                }
            }
            p.display();
        }
    }
}
