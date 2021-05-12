package pl.mkorcz.projectmanagementapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository <Project, Long> {

    @Override
    public List<Project> findAll();
}
