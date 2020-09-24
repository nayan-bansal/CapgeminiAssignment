package javaEmployee;

public class Employe {
	//Constant
	public static final int  EMP_FTE = 1;
	
	public static void main(String[] args) {
	
		//Print Starting Message
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		
		//Data Type to check Attendance
		double check = Math.floor(Math.random()*10)%2;
		
		//Main Logic of Program
		if(check == EMP_FTE) 
		System.out.println("Employee is Present");
		else
		System.out.println("Employee is Absent");	
	
	}

}