package kodlama.io.hrms.core.utilities.results;

public class ErrorResult extends Result{

	public ErrorResult(String message) {
		super(false, message);
		
	}

	public ErrorResult() {
		super(false);
		// TODO Auto-generated constructor stub
	}
}
