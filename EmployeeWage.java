package javaEmployee;

public class UC_6 {
	public static final int  EMP_FTE = 1;
	public static final int  EMP_WAGE=20;	
	public static final int  EMP_HOUR=8;
	public static final int  EMP_PTE = 2;
	public static final int  EMP_PTE_HOUR = 4;
	public static final int  EMP_WORKING_DAYS = 20;
	public static final int  EMP_HOUR_LIMIT = 100;
	
		public static void main(String[] args) {
		
			//Print Starting Message
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			
			//Data Type to check Attendance
			double check = Math.floor(Math.random()*10)%3;
			System.out.println("Employ Check: "+ check);
			
			//Main Logic FTE
			if(check == EMP_FTE) { 
			System.out.println("Employee is Present and Full Time");	
			if(EMP_HOUR*EMP_WORKING_DAYS >= EMP_HOUR_LIMIT)
			System.out.println("Employ Wage= "+EMP_WAGE*EMP_HOUR_LIMIT);
			else
				System.out.println("Employ Wage= "+EMP_WAGE*EMP_HOUR*EMP_WORKING_DAYS);	
			}
			
			//Main Logic PTE 
			else if(check == EMP_PTE) { 
				System.out.println("Employee is Present and Part Time");	
				if(EMP_PTE_HOUR*EMP_WORKING_DAYS >= EMP_HOUR_LIMIT)
				System.out.println("Employ Wage= "+EMP_WAGE*EMP_HOUR_LIMIT);
				else
				System.out.println("Employ Wage= "+EMP_WAGE*EMP_PTE_HOUR*EMP_WORKING_DAYS);	
				}
			//Employee Absent
			
			else
			System.out.println("Employee is Absent");	
		}
}