package HRMS.HRMS.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employer_confirmation")
@Data
public class EmployerConfirmation {
    @Id
    @GeneratedValue
    @Column(name = "employer_id")
    private int employerid;

    @Column(name = " is_confirmated")
    private String isconfirmated;

    @Column(name = "confirmated_by_staffid")
    private int confirmatedbystaffid;
}