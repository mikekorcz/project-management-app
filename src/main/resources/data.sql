-- INSERT EMPLOYEES
insert into employee (employee_id, first_name, last_name, email) values (1, 'Mike', 'Korcz', 'mkorcz@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (2, 'John', 'Kowalsky', 'jkowalsky@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (3, 'Edward', 'Galante', 'egalante@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (4, 'Andy', 'Cohen', 'acohen@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (5, 'Mary', 'Wordson', 'mwordson@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (6, 'Katie', 'Black', 'kblack@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (7, 'Margot', 'Beige', 'mbeige@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (8, 'Lara', 'Brandon', 'lbrandon@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (9, 'Luisa', 'tanto', 'ltanto@gmail.com');

-- INSERT PROJECTS
insert into project (project_id, name, stage, description) values (1000, 'Project1', 'NOTSTARTED', 'Description1');
insert into project (project_id, name, stage, description) values (1001, 'Project2t',  'COMPLETED', 'Description2');
insert into project (project_id, name, stage, description) values (1002, 'Project3', 'INPROGRESS', 'Description3');
insert into project (project_id, name, stage, description) values (1003, 'Project4', 'INPROGRESS', 'Description4');

-- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
insert into project_employee (employee_id, project_id) values (1,1000);
insert into project_employee (employee_id, project_id) values (1,1001);
insert into project_employee (employee_id, project_id) values (1,1002);
insert into project_employee (employee_id, project_id) values (3,1000);
insert into project_employee (employee_id, project_id) values (6,1002);
insert into project_employee (employee_id, project_id) values (6,1003);
