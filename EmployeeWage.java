package javaEmployee;

public class EmployeeWage {
	
	int emp_wage = 0;
	
	private int emp_check;
	private int wage_hour;
	private int hours_FTE;
	private int hour_limit;
	private int month_days;
	
	int emp_hour = 0;
	int day_count =0;
	int total_wage = 0;

	private int hours_PTE;
	
	public EmployeeWage(int emp_check, int wage_hour ,int hours_FTE ,int hours_PTE, int hour_limit, int month_days) {
		
		this.emp_check  = emp_check;
		this.wage_hour = wage_hour;
		this.hours_FTE = hours_FTE;
		this.hours_PTE = hours_PTE;
		this.hour_limit = hour_limit;
		this.month_days = month_days;
	}
	
	
	public void EmpWage() {
		
		System.out.println("Days \t Total Hours \t Total Wage");
		while(emp_hour<hour_limit && day_count<=month_days) {
			
			switch(emp_check) {
			case 1: 
			total_wage = total_wage + wage_hour*hours_PTE;
			emp_hour = emp_hour + hours_PTE;
			System.out.println(day_count+" \t "+emp_hour+" \t "+total_wage+" (Part Time Employee)");
			break;
			case 2: 
			total_wage = total_wage + wage_hour*hours_FTE;
			emp_hour = emp_hour + hours_FTE;
			System.out.println(day_count+" \t "+emp_hour+" \t \t"+total_wage+" (Full Time Employee)");
			break;
			case 0:
			System.out.println("Employee is absent on Day "+day_count);
			break;
			}
			++day_count;
		}
		System.out.println("Finally Wage calculated for one month is : "+total_wage);
	}


	
	
}