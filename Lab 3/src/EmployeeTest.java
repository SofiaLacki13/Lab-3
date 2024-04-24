//Programmer: Sofia Lacki
//Source: DD
//Class: CS 145 f-f 9:30am
//Purpose: Utilize superclasses to better organize data and to include employees who aren't
//      on commission at all

import java.util.Scanner;
import employees.*;

public class EmployeeTest {
    public static void main(String[] args) {
        //Create empty variables
        String firstName;
        String lastName;
        String socialSecurityID;
        Employee employee;
        CommissionEmployee commissionEmployee;
        BasePlusCommissionEmployee basePlus;

        //Create scanner variable for input
        Scanner input = new Scanner(System.in);

        //Get the employee's first name
        System.out.println("What is the employee's first name?");
        firstName = input.next();

        //Get the employee's last name
        System.out.println("What is the employee's last name?");
        lastName = input.next();

        //Get the employee's social security number
        System.out.println("What is the employee's social security number?");
        socialSecurityID = input.next();

        //Find out if the employee is on commission
        System.out.println("Is commission included in the employee's pay? (y/n)");
        String commission = input.next();

        //Find extra information about commission employees
        if (commission.equals("y")) {//start of commission
            //Find the employee's commission rate
            System.out.println("What is the employee's commission rate? 0.0-1.0");
            double commissionRate = input.nextDouble();

            //Find the employee's gross sales
            System.out.println("What is the employee's gross sales?");
            double grossSales = input.nextDouble();

            //Find out if the commission employee has a base pay as well
            System.out.println("Is the employee paid a base pay plus commission? y/n");
            String basePayment = input.next();

            //find out extra information about base pay
            if (basePayment.equals("y")) {//start of base pay
                //Find the base pay
                System.out.println("What is the employee's base hourly pay?");
                double basePay = input.nextDouble();

                //Create Employee base plus commission object
                basePlus = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityID, grossSales, commissionRate, basePay);
                System.out.println();
                System.out.println(basePlus);

            } else {//end of base pay
                //Create Employee on commission object
                commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityID, grossSales, commissionRate);
                System.out.println();
                System.out.println(commissionEmployee.toString());
            } //end of commission only employee

        } else {//end of commission employees
            employee = new Employee(firstName, lastName, socialSecurityID);
            System.out.println();
            System.out.println(employee.toString());
        } //set regular employee
        
    } //end of main
} //end of test class