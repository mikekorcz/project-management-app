package pl.mkorcz.projectmanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.mkorcz.projectmanagementapp.dao.EmployeeRepository;
import pl.mkorcz.projectmanagementapp.dao.ProjectRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;
import pl.mkorcz.projectmanagementapp.entities.Project;

import javax.swing.*;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public String displayProjects(Model model) {
        List<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        return "projects/list-projects";
    }

    @GetMapping("/new")
    public String displayProjectForm(Model model) {

        Project aProject = new Project();

        List<Employee> employees = employeeRepository.findAll();

        model.addAttribute("project", aProject);
        model.addAttribute("allEmployees", employees);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
        projectRepo.save(project);


        // use a redirect to prevent duplicate submissions
        return "redirect:/projects";
    }
}
