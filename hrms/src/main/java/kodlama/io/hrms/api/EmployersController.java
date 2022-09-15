package kodlama.io.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployersService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.verification.MyApproveService;
import kodlama.io.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

	private EmployersService employersService;
	private MyApproveService myApproveService;

	@Autowired
	public EmployersController(EmployersService employersService, MyApproveService myApproveService) {
		super();
		this.employersService = employersService;
		this.myApproveService = myApproveService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll(){
		return this.employersService.getAll();
	}
	
	

	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		myApproveService.isApprovedFromUs(employers);
		return this.employersService.add(employers);
	}
}




