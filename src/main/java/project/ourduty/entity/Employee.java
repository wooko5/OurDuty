package project.ourduty.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Employee extends BaseEntity {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue
    private Long id;
    private String name;
    private String department;
    private String job;
    private Boolean gender;
    private String phoneNumber;

    public Employee(String name, String department, String job, Boolean gender, String phoneNumber) {
        this.name = name;
        this.department = department;
        this.job = job;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
}
