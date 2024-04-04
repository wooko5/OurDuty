package project.ourduty.dto.response;

import lombok.Data;
import project.ourduty.entity.Employee;

@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private String department;
    private String job;
    private Boolean gender;
    private String phoneNumber;

    public EmployeeResponse(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.department = employee.getName();
        this.job = employee.getJob();
        this.gender = employee.getGender();
        this.phoneNumber = employee.getPhoneNumber();
    }
}
