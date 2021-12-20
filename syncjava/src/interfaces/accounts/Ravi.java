package interfaces.accounts;

public class Ravi {
	
	static void sendEmail(String issue) {
		HrManager hrManager = new HrManager();
		hrManager.addressMyconcern();
	}
	
	public static void main(String[] args) {
		sendEmail("payslip issue");
		System.out.println("ravi has sent an email");
	}

}
