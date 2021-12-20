package interfaces.accounts;

public class Zaid implements AccountsListener{

	public void handlesPaySlip(String name) {
		System.out.println("zaid replying to payslip issue");
	}
}
