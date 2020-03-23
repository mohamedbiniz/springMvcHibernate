package com.spring.mvc.Controller;

import com.spring.mvc.entities.Employee;
import com.spring.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService EmployeeService;

    @Autowired(required=true)
    public void setEmployeeService(EmployeeService employeeService) {
        EmployeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> theEmployees = EmployeeService.getEmployees();
        theModel.addAttribute("employees", theEmployees);
        return "employees/list-Employees";
    }

    @GetMapping("/addForm")
    public String showFormForAdd(Model theModel) {
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);
        return "employees/Employee-form";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee theEmployee, BindingResult result) {
        if(result.hasErrors()){
            return "employees/Employee-form";
        }
        EmployeeService.saveEmployee(theEmployee);
        return "redirect:/employee/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("EmployeeId") int theId,
                                    Model theModel) {
        Employee theEmployee = EmployeeService.getEmployee(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employees/Employee-form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("EmployeeId") int theId) {
        EmployeeService.deleteEmployee(theId);
        return "redirect:/employee/list";
    }
}
