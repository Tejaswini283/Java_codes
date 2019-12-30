package NewProgramme;

public class Employee {
	private int empid;
	private String empname;
	private int salary;
	public Employee()
	{
	}
	public Employee(int empid, String empname,int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
		
	
}
