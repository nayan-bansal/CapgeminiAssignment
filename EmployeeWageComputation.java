package jaemployeev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class EmployeeWageComputation {
	public static void main(String[] args) {
		
		//object of builder class
		EmpWageBuilder emp=new EmpWageBuilder();
		//scanner class to take user inputs
		Scanner obj = new Scanner(System.in);
		//object of company emp wage class
		CompanyEmpWage c=new CompanyEmpWage();
		//setting the values of company emp wage class
		System.out.println("Enter Company name");
		c.setCompany_name(obj.next());
		System.out.println("Enter Total Working Hours");
		c.setWorking_hrs_per_month(obj.nextInt());
		System.out.println("Enter Total Working Days");
		c.setWorking_day_per_month(obj.nextInt());
		System.out.println("Enter Wage per hour");
		c.setEmp_wage_per_hr(obj.nextInt());
		emp.addCompany(c);
		int emp_wage=emp.computeEmpWage(c.getEmp_wage_per_hr(),c.getWorking_day_per_month(),c.getWorking_hrs_per_month(),c.getCompany_name());
		System.out.println("Company Wage :"+emp_wage);

	}
}