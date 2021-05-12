package pl.mkorcz.projectmanagementapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Override
    public List<Employee> findAll();
}
