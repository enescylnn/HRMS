package HRMS.HRMS.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job")
public class Job extends User{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private String userid;

    @Column(name = "title")
    private String title;
}