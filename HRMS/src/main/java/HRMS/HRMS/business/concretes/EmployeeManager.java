package HRMS.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import HRMS.HRMS.business.abstracts.EmployeeService;
import HRMS.HRMS.dataAccess.abstracts.EmployeeDao;
import HRMS.HRMS.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {
	
private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		return this.employeeDao.findAll();
	}

}
