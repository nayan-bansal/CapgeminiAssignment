package javaEmployee;

public class EmployeeWage {
//Constant
	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int TOTAL_WORKING_HRS=100;
	public static final int TOTAL_WORKING_DAYS=20;
	
	//method to compute the employee wages
	public static int empWageCalculation(int emp_check) {
		int emp_hours=0;
		int emp_wage=0;
		
		switch(emp_check) {
		case IS_FULL_TIME :
			System.out.println("Employee is full time");
			emp_hours=8;
			if(emp_hours*TOTAL_WORKING_DAYS>=TOTAL_WORKING_HRS) {
				emp_wage=TOTAL_WORKING_HRS*WAGE_PER_HOUR;
			}
			else {
				emp_wage=TOTAL_WORKING_DAYS*emp_hours*WAGE_PER_HOUR;
			}
			break;
		case IS_PART_TIME : 
			System.out.println("Employee is part time");
			emp_hours=4;
			if(emp_hours*TOTAL_WORKING_DAYS>=TOTAL_WORKING_HRS) {
				emp_wage=TOTAL_WORKING_HRS*WAGE_PER_HOUR;
			}
			else {
				emp_wage=TOTAL_WORKING_DAYS*emp_hours*WAGE_PER_HOUR;
			}
			break;
		default :
			System.out.println("Employee absent");
			emp_wage=0;
		}
		
		return emp_wage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Generating random number to determine type of object
		int type_of_emp = (int) Math.floor(Math.random()*10)%3;
		
		//Calling the static method which computes employee wage
		int emp_wage=empwage.empWageCalculation(type_of_emp);
		System.out.println("Employee Wage for a month: "+ emp_wage);
		
	}

}