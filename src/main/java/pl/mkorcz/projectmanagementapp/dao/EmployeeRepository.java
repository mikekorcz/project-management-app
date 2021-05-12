package pl.mkorcz.projectmanagementapp.dao;

import org.springframework.data.repository.CrudRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
