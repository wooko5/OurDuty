package project.ourduty.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.ourduty.dto.response.EmployeeResponse;
import project.ourduty.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<EmployeeResponse> getAllEmployees() {
        return employeeRepository.findAll().stream().map(EmployeeResponse::new).collect(Collectors.toList());
    }

    public EmployeeResponse getEmployeeByName(String name) {
        return new EmployeeResponse(employeeRepository.findEmployeeByName(name));
    }
}
