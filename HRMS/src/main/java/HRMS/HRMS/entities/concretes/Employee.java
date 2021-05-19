package HRMS.HRMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="employee_name")
	private int employeeName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="date_of_birh")
	private LocalDate dateOfBirth;
	
	@Column(name="password")
	private String password;
	
	@Column(name="re_password")
	private String rePassword;
	
	public Employee() {}

	public Employee(int employeeId, int employeeName, String identityNumber, String password, String rePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.identityNumber = identityNumber;
		this.password = password;
		this.rePassword = rePassword;
	}
	
	

}
