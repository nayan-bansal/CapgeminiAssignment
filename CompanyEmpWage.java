package javaemployee;

public class CompanyEmpWage {
	
	private int working_hrs_per_month;
	private int emp_wage_per_hr;
	private int working_day_per_month;
	private String company_name;
	private int total_emp_wage;
	private int daily_wage;

	public int getTotal_emp_wage() {
		return total_emp_wage;
	}

	public void setTotal_emp_wage(int total_emp_wage) {
		this.total_emp_wage = total_emp_wage;
	}

	public int getDaily_wage() {
		return daily_wage;
	}

	public void setDaily_wage(int daily_wage) {
		this.daily_wage = daily_wage;
	}

	public int getWorking_hrs_per_month() {
		return working_hrs_per_month;
	}

	public void setWorking_hrs_per_month(int working_hrs_per_month) {
		this.working_hrs_per_month = working_hrs_per_month;
	}

	public int getEmp_wage_per_hr() {
		return emp_wage_per_hr;
	}

	public void setEmp_wage_per_hr(int emp_wage_per_hr) {
		this.emp_wage_per_hr = emp_wage_per_hr;
	}

	public int getWorking_day_per_month() {
		return working_day_per_month;
	}

	public void setWorking_day_per_month(int working_day_per_month) {
		this.working_day_per_month = working_day_per_month;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
}