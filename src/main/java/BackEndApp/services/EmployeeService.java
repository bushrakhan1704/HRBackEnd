package BackEndApp.services;

import java.util.List;

import BackEndApp.models.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public String uploadEmployee(Employee emp);
	public String updateEmployee(Employee emp);
}
