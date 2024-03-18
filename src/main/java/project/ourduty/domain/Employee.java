package project.ourduty.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String department;
    private String job;
    private Boolean gender;
    private String phoneNumber;
}
