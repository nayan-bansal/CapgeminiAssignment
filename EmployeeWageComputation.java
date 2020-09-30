package javaEmployee;

public class EmployeeWageComputation{
	
	public static void main(String[] args) {
	
		
		int emp_check = (int) (Math.floor(Math.random()*10)%3);
		int company_check = (int) (Math.floor(Math.random()*10)%3);
	
		switch(company_check) {
		
		case 1: //Reliance
			System.out.println("Reliance Employee");
			EmployeeWage wageReliance = new EmployeeWage(emp_check, 45, 9, 6, 150, 18);
			 wageReliance.EmpWage();	
			break;
		
		case 2: // Capgemini
			System.out.println("Capgemini Employee");
			EmployeeWage wageCapgemini = new EmployeeWage(emp_check, 55, 10, 4, 160, 20);
		     wageCapgemini.EmpWage();
			break;
		
		case 0: // Amazon 
			System.out.println("Amazon Employee");
			EmployeeWage wageAmazon = new EmployeeWage(emp_check, 50, 12, 5, 180, 22);
		     wageAmazon.EmpWage();
			break;
		}
	}
}
