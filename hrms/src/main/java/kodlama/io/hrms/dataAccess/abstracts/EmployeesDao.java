package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Employees;


public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}
