package project.ourduty.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import project.ourduty.common.ApiResponse;
import project.ourduty.common.ErrorCode;
import project.ourduty.dto.response.EmployeeResponse;
import project.ourduty.service.EmployeeService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public String getAllEmployees(Model model) {
        List<EmployeeResponse> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "tables";
    }


    @ResponseBodyit
    @GetMapping("/employees")
    public ApiResponse<EmployeeResponse> getEmployeeByName(@RequestParam String name) {
        if (name == null || name.isBlank()) {
            return ApiResponse.fail(ErrorCode.FAIL);
        }
        return ApiResponse.ok(employeeService.getEmployeeByName(name));
    }
}
