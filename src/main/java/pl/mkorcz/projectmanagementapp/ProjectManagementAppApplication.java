package pl.mkorcz.projectmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.mkorcz.projectmanagementapp.dao.EmployeeRepository;
import pl.mkorcz.projectmanagementapp.dao.ProjectRepository;
import pl.mkorcz.projectmanagementapp.entities.Employee;
import pl.mkorcz.projectmanagementapp.entities.Project;

import java.util.Arrays;

@SpringBootApplication
public class ProjectManagementAppApplication {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;


	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementAppApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner()  {
//		return args -> {
//			Employee employee1 = new Employee("Mike", "Korcz", "mkorcz@gmail.com");
//			Employee employee2 = new Employee("John", "Kowalsky", "jkowalsky@gmail.com");
//			Employee employee3 = new Employee("Edward", "Galante", "egalange@gmail.com");
//			Employee employee4 = new Employee("Andy", "Cohen", "acohen@gmail.com");
//			Employee employee5 = new Employee("Mary", "Wordson", "mwordson@gmail.com");
//			Employee employee6 = new Employee("Katie", "Black", "kblack@gmail.com");
//			Employee employee7 = new Employee("Margot", "Beige", "mbeige@gmail.com");
//			Employee employee8 = new Employee("Luisa", "Tanto", "ltanto	@gmail.com");
//
//			Project pro1 = new Project("Project1", "NOTSTARTED", "Description1");
//			Project pro2 = new Project("Project2", "INPROGRESS", "Description2");
//			Project pro3 = new Project("Project3", "COMPLETED", "Description3");
//			Project pro4 = new Project("Project3", "NOTSTARTED", "Description4");
//
//			pro1.addEmployee(employee1);
//			pro1.addEmployee(employee2);
//			pro2.addEmployee(employee3);
//			pro3.addEmployee(employee1);
//			pro4.addEmployee(employee1);
//			pro4.addEmployee(employee3);
//
//			employee1.setProjects((Arrays.asList(pro1, pro3, pro4)));
//			employee2.setProjects((Arrays.asList(pro1)));
//			employee3.setProjects((Arrays.asList(pro2, pro4)));
//
//			employeeRepository.save(employee1);
//			employeeRepository.save(employee2);
//			employeeRepository.save(employee3);
//			employeeRepository.save(employee4);
//			employeeRepository.save(employee5);
//			employeeRepository.save(employee6);
//			employeeRepository.save(employee7);
//			employeeRepository.save(employee8);
//
//			projectRepository.save(pro1);
//			projectRepository.save(pro2);
//			projectRepository.save(pro3);
//			projectRepository.save(pro4);
//
//		};
//	}
}
