package kodlama.io.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.CandidatesService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.ErrorResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.core.utilities.results.verification.EmailVerificationService;
import kodlama.io.hrms.dataAccess.abstracts.CandidatesDao;
import kodlama.io.hrms.entities.concretes.Candidates;


@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private EmailVerificationService emailVerificationService;

	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao, EmailVerificationService emailVerificationService) {
		super();
		this.candidatesDao = candidatesDao;
		this.emailVerificationService = emailVerificationService;
	}
	
	@Override
	public DataResult<List<Candidates>> getAll() {	
		return new SuccessDataResult<List<Candidates>>(candidatesDao.findAll(),"Candidates listed.");
	}

	

	@Override
	public Result add(Candidates candidates) {
		if(emailVerificationService.uniqueEmail()==true) {
			emailVerificationService.emailVerification(candidates.getEmail());
			this.candidatesDao.save(candidates);
		return new SuccessResult("Candidates added sucessfully .");
		}
		else
			return new ErrorResult("Candidates email verification is not approved.");
	
	}
	
	
}
