package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployersService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.EmployersDao;
import kodlama.io.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;

	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(employersDao.findAll(), "Data listed.");
	}

	@Override
	public Result add(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult("Employers added");
	}
	
	
	
}
