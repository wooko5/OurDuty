package project.ourduty.dto.response;

import lombok.Data;
import project.ourduty.entity.Employee;

import java.time.LocalDateTime;

@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private String department;
    private String job;
    private Boolean gender;
    private String phoneNumber;
    private String createdBy;
    private String lastModifiedBy;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

//    public EmployeeResponse(Employee employee) {
//        this.id = employee.getId();
//        this.name = employee.getName();
//        this.department = employee.getDepartment();
//        this.job = employee.getJob();
//        this.gender = employee.getGender();
//        this.phoneNumber = employee.getPhoneNumber();
//    }

    public EmployeeResponse(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.department = employee.getDepartment();
        this.job = employee.getJob();
        this.gender = employee.getGender();
        this.phoneNumber = employee.getPhoneNumber();
        this.createdBy = employee.getCreatedBy();
        this.lastModifiedBy = employee.getLastModifiedBy();
        this.createdDate = employee.getCreatedDate();
        this.lastModifiedDate = employee.getLastModifiedDate();
    }
}
