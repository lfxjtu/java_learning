//import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp01 = new Employee("Kevin");
        Employee emp02 = new Employee("Allen");

        emp01.empAge(26);
        emp01.empDesignation("Senior software engineer");
        emp01.empSalary(5000);

        emp02.empAge(22);
        emp02.empDesignation("software tester");
        emp02.empSalary(4000);

        emp01.printEmployee();
        System.out.println();
        emp02.printEmployee();
    }
}
