package javaEmployee;

public class EmployeeWage {
public static final int  EMP_FTE = 1;
public static final int  EMP_WAGE=20;	
public static final int  EMP_HOUR=20;
	public static void main(String[] args) {
	
		//Print Starting Message
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		
		//Data Type to check Attendance
		double check = Math.floor(Math.random()*10)%2;
		System.out.println("Employ Check: "+ check);
		
		//Main Logic of Program
		if(check == EMP_FTE) { 
		System.out.println("Employee is Present");	
		System.out.println("Employ Wage= "+EMP_WAGE*EMP_HOUR);
		}
		else
		System.out.println("Employee is Absent");	
	
	}

}