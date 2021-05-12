package pl.mkorcz.projectmanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mkorcz.projectmanagementapp.dao.EmployeeRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        Employee employee = new Employee();

        model.addAttribute("employee", employee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Model mode, Employee employee)  {
        employeeRepo.save(employee);
        return "redirect:/employees/new";
    }


}
