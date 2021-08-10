package pl.mkorcz.projectmanagementapp.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.mkorcz.projectmanagementapp.dao.EmployeeRepository;
import pl.mkorcz.projectmanagementapp.dao.ProjectRepository;
import pl.mkorcz.projectmanagementapp.dto.ChartData;
import pl.mkorcz.projectmanagementapp.dto.EmployeeProject;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Value("${version}")
    private String ver;

    @Autowired
    ProjectRepository projectRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/")
    public String displayHome(Model model) throws JsonProcessingException {

        model.addAttribute("versionNumber", ver);

        Map<String, Object> map = new HashMap<>();

        List<Project> projectList = projectRepo.findAll();
        model.addAttribute("projects", projectList);

        List<ChartData> projectData = projectRepo.getProjectStatus();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projectData);

        model.addAttribute("projectStatusCnt", jsonString);


        List<EmployeeProject> employeeProjectCnt = employeeRepo.employeeProjects();
        model.addAttribute("employeesCnt", employeeProjectCnt);
        return "main/home";
    }
}
