package project.ourduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ourduty.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee findEmployeeByName(String name);
}
