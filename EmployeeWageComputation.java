package javaemployee;
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;
public class EmployeeWageComputation {
	public static void main(String[] args) {
	
		//object of builder class
		EmpWageBuilder emp=new EmpWageBuilder();
		//scanner class to take user inputs
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter 1 to add company emp wage calculation details");
		System.out.println("Enter 2 to display details in arraylist");
		System.out.println("Enter 3 to display total wage by company name");
		System.out.println("Enter 0 to exit");
		while(true) {
			System.out.println("Enter option");
			int option=obj.nextInt();
			if(option==1) {
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
					//adding company emp wage details in arraylist
					emp.addCompany(c);
					int emp_wage=emp.computeEmpWage(c);
					System.out.println("Company Wage :"+emp_wage);
					c.setTotal_emp_wage(emp_wage);
				}	
			else if(option==2) {
					ArrayList<CompanyEmpWage> result = emp.viewAllDetails();
					Iterator<CompanyEmpWage> iter=result.iterator();
					while(iter.hasNext()) {
						CompanyEmpWage c1=(CompanyEmpWage)iter.next();
						System.out.println("total working hrs "+c1.getWorking_hrs_per_month());
						System.out.println("total working days "+c1.getWorking_day_per_month());
						System.out.println("wage per hr "+c1.getEmp_wage_per_hr());
						System.out.println("Company name "+c1.getCompany_name());
						System.out.println("Daily Wage "+c1.getDaily_wage());
						System.out.println("total wage "+c1.getTotal_emp_wage());
						}
			}
			else if (option==3) {
					System.out.println("Enter the company name to get total wages");
					String company_name=obj.next();
					emp.PrintQueryDetails(company_name);
			}
			else {
					break;
		}
		}
	}
}