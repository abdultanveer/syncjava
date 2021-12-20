package interfaces.accounts;

public class HrManager {
	public static void main(String[] args) {
	}

	public void addressMyconcern() {
		//Manasvi manasvi = new Manasvi();
		AccountsListener aListener = new Manasvi();
				//Zaid();
		//Zaid zaid = new Zaid();
		aListener.handlesPaySlip(aListener.getClass().getSimpleName());
		System.out.println("HR has"+ aListener.getClass().getSimpleName()+" asked to solve");
		
	}

}
