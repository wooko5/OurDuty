package project.ourduty.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ourduty.dto.EmployeeResponse;
import project.ourduty.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<EmployeeResponse> getEmployees() {
        return employeeRepository.findAll().stream().map(EmployeeResponse::new).collect(Collectors.toList());
    }
}
