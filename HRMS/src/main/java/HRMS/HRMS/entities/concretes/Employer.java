package HRMS.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employer")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name="")
	private int employerId;
	
	@Column(name="")
	private String employerName;
	
	private String employerLastName;
	

}
