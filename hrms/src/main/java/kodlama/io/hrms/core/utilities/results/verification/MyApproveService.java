package kodlama.io.hrms.core.utilities.results.verification;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employers;

public interface MyApproveService {

	Result isApprovedFromUs(Employers employers);
}
