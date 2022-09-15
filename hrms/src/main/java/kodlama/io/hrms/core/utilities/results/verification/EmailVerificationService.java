package kodlama.io.hrms.core.utilities.results.verification;



import kodlama.io.hrms.core.utilities.results.Result;

public interface EmailVerificationService {


	public Result emailVerification(String email);
	public boolean uniqueEmail();
}
