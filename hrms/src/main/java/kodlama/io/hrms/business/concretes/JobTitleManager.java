package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobTitleService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.JobTitlesDao;
import kodlama.io.hrms.entities.concretes.JobTitles;
@Service
public class JobTitleManager implements JobTitleService {

	private JobTitlesDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitlesDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public DataResult<List<JobTitles>> getAll() {	
		return new SuccessDataResult<List<JobTitles>>(jobTitleDao.findAll(),"Job Titles are listed.");
	}


	@Override
	public Result add(JobTitles jobTitles) {
		 this.jobTitleDao.save(jobTitles);
		return new SuccessResult("Job title added.");
	}

}
