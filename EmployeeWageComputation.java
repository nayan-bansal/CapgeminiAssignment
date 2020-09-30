package javaEmployee;

public class EmployeeWageComputation{
	
	private static final int IS_ABSENT = 0;
	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;
	
	private static final int IS_AMAZON = 0;
	private static final int IS_RELIANCE = 1;
	private static final int IS_CAPGEMINI = 2;

	
	public static void main(String[] args) {
	
		int emp_check = (int) (Math.floor(Math.random()*10)%3);
		int company_check = (int) (Math.floor(Math.random()*10)%3);
		
		int emp_wage = 0;
		
		 // Capgemini
		System.out.println("Capgemini Employee");
		EmployeeWage wageCapgemini = new EmployeeWage(emp_check, 55, 10, 4, 160, 20);
                wageCapgemini.EmpWage();
		
	}
}
