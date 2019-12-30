package NewProgramme;

public class EmployeeAdder {

	public void AddEmployee(Employee emp) throws Exception{
		if(emp.getEmpid()<=9999 || emp.getEmpid()>99999) {
		throw new InvalidEmployeeException("Invalid ");
			
		}
		if(emp.getEmpname().length()<3) {
			throw new InvalidEmployeeException("Invalid name");
		}
		if(emp.getSalary()<3000||emp.getSalary()>8000)
	{
			throw new InvalidEmployeeException("Invalid salary");

		
	}
	}
}

