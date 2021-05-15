package pl.mkorcz.projectmanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mkorcz.projectmanagementapp.dao.EmployeeRepository;
import pl.mkorcz.projectmanagementapp.dao.ProjectRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/")
    public String displayHome(Model model)  {
        List<Project> projectList = projectRepo.findAll();
        model.addAttribute("projectsList", projectList);

        List<Employee> employeeList = employeeRepo.findAll();
        model.addAttribute("employeesList", employeeList);
        return "main/home";
    }
}
