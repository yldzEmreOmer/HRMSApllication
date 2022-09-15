package kodlama.io.hrms.core.utilities.results.verification;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public Result emailVerification(String email) {
		
		return new SuccessResult(email + " is approved");
	}

	@Override
	public boolean uniqueEmail() {
		
		
		return true;
	}

}
