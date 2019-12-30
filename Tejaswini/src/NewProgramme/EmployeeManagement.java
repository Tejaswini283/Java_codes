package NewProgramme;

public class EmployeeManagement {
	public static void main(String[] args) {
		Employee emp=new Employee(101,"mahesh",5000);
		EmployeeAdder empAdd=new EmployeeAdder();
		try{
			empAdd.AddEmployee(emp);
		}
catch(Exception e) {
	System.out.println("error="+e.getMessage());
}
	}
	

}
