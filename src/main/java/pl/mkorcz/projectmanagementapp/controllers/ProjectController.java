package pl.mkorcz.projectmanagementapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mkorcz.projectmanagementapp.entities.Project;

@Controller
@RequestMapping("/projects/")
public class ProjectController {

    @GetMapping("/new")


    public String displayProjectForm(Model model) {
        Project aProject = new Project();

        model.addAttribute("project", aProject);
        return "new-project";
    }
}