package HRMS.HRMS.business.abstracts;

import java.util.List;

import HRMS.HRMS.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();
}
