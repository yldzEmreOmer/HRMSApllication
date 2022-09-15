package kodlama.io.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployeesService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	private EmployeesService employeesService;

	@Autowired
	public EmployeesController(EmployeesService employeesService) {
		super();
		this.employeesService = employeesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employees>> getAll(){
		return this.employeesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employees employee) {
		return this.employeesService.add(employee);
	}
	
}
