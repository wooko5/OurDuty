package project.ourduty.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.ourduty.dto.EmployeeResponse;
import project.ourduty.service.EmployeeService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String getEmployees(Model model) {
        List<EmployeeResponse> employees = employeeService.getEmployees();
        model.addAttribute("employees", employees);
        return "tables";
    }
}
