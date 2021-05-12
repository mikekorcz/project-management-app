package pl.mkorcz.projectmanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mkorcz.projectmanagementapp.dao.ProjectRepository;
import pl.mkorcz.projectmanagementapp.entities.Project;

@Controller
@RequestMapping("/projects/")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepo;



    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        Project aProject = new Project();

        model.addAttribute("project", aProject);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model) {
        projectRepo.save(project);

        // use a redirect to prevent duplicate submissions
        return "redirect:/projects/new";
    }
}
