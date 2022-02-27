package javalambdas.ch02;


import javalambdas.employee.Employee;
import javalambdas.employee.Skill;

public class JavaSkillsFilter implements EmployeeFilter {

	@Override
	public boolean filterEmployee(Employee employee) {
		return employee.getSkills().contains(Skill.JAVA);
	}

}
