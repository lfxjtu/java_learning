package fang.java.old;//import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class fang.java.old.Employee
    public Employee(String name) {
        this.name = name;
    }

    // Assign the age of the fang.java.old.Employee to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable salary. */
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the fang.java.old.Employee details */
    public void printEmployee() {
        System.out.println("fang.java.old.Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

}
