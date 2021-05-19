package HRMS.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.HRMS.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
