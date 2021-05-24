package pl.mkorcz.projectmanagementapp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.mkorcz.projectmanagementapp.dto.ChartData;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository <Project, Long> {

    @Override
    public List<Project> findAll();

    @Query(nativeQuery=true, value="SELECT stage as label, COUNT(*) as value " +
            "FROM project " +
            "GROUP BY stage")
    public List<ChartData> getProjectStatus();
}
