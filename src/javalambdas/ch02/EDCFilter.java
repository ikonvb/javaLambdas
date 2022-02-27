package javalambdas.ch02;


import javalambdas.employee.Employee;
import javalambdas.employee.Unit;

public class EDCFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getUnit()== Unit.EDC;
	}

}
