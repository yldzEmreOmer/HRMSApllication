package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployeesService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployeesDao;
import kodlama.io.hrms.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService{

	private EmployeesDao employeesDao;

	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>(employeesDao.findAll(),"Data Listed");
	}

	@Override
	public Result add(Employees employee) {
		this.employeesDao.save(employee);
		return new SuccessResult("Employee added");
	}
	
	
	
}
