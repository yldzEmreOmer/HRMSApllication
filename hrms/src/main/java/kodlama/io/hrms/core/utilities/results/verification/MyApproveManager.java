package kodlama.io.hrms.core.utilities.results.verification;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.Employers;

@Service
public class MyApproveManager implements MyApproveService{

	@Override
	public Result isApprovedFromUs(Employers employers) {
		
		return new SuccessResult();
	}

}
