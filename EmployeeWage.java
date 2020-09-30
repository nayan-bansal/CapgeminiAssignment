package javaEmployee;

import java.util.*;

public class EmployeeWage {
	//constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	Scanner sc=new Scanner(System.in);
	
	//ArrayList
	public ArrayList<CompanyEmpWage> company_emp_wage=new ArrayList<CompanyEmpWage>();
	
	//setter
	public void setCompany(ArrayList<CompanyEmpWage> company_emp_wage) {
		this.company_emp_wage=company_emp_wage;
	}
	
	//getter
	public ArrayList<CompanyEmpWage> getCompany() {
		return company_emp_wage;
	}
	
	//Method to add contact person details
	public void addCompany(CompanyEmpWage pobj ) {
		company_emp_wage.add(pobj);
	}
	
	//method to view company employee details
	public ArrayList<CompanyEmpWage> viewAllDetails(){
		return company_emp_wage;
	}	
	
	//Method to compute Company Wage
	public int computeEmpWage(int emp_wage_per_hr, int working_day_per_month, int working_hrs_per_month, String company_name) {
		int emp_hrs_per_day;
		int total_hrs=0;
		int total_working_days=0;
		System.out.println("Day\t Hours Worked\tTotal Wage");
		while(total_hrs<=working_hrs_per_month && total_working_days<working_day_per_month) {
		total_working_days++;
		int emp_check= (int) Math.floor(Math.random()*10)%3;
		switch(emp_check) {
		case IS_FULL_TIME:
			emp_hrs_per_day=8;
			break;
		case IS_PART_TIME:
			emp_hrs_per_day=4;
			break;
		default:  
			emp_hrs_per_day=0;
			
		}
		int emp_wage=emp_hrs_per_day*emp_wage_per_hr;
		total_hrs+=emp_hrs_per_day;
		total_working_days++;
		System.out.println(" "+total_working_days+" \t"+total_hrs+" \t\t"+emp_wage);
	}
		return total_hrs*emp_wage_per_hr;
	}
	}