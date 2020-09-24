package javaEmployee;

public class UC_5 {
	public static final int  EMP_FTE = 1;
	public static final int  EMP_WAGE=20;	
	public static final int  EMP_HOUR=8;
	public static final int  EMP_PTE = 2;
	public static final int  EMP_PTE_HOUR = 4;
	public static final int  EMP_WORKING_DAYS = 20;
	
		public static void main(String[] args) {
		
			//Print Starting Message
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			//Data Type to check Attendance
			double check = Math.floor(Math.random()*10)%3;
			System.out.println("Employ Check: "+ check);
			
			//Main Logic of Program
			if(check == EMP_FTE) { 
			System.out.println("Employee is Present");	
			System.out.println("Employ Wage= "+EMP_WAGE*EMP_HOUR*EMP_WORKING_DAYS);
			}
			else if(check == EMP_PTE) { 
				System.out.println("Employee is Present and Part Time");	
				System.out.println("Employ Wage= "+EMP_WAGE*EMP_PTE_HOUR*EMP_WORKING_DAYS);
				}
			else
			System.out.println("Employee is Absent");	
		
		}

}