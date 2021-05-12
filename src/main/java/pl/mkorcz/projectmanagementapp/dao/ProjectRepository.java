package pl.mkorcz.projectmanagementapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mkorcz.projectmanagementapp.entities.Project;

public interface ProjectRepository extends CrudRepository <Project, Long> {
}
