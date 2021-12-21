package threads;
class DbThreadForm extends Thread{  
	
	public void run(){  
		queryDb();
	}  
	
	public void queryDb() {
		//imagine this method takes 10 secs for execution
		System.out.println("querying db..");
	}
	public static void main(String args[]){  
		DbThreadForm t1 = new DbThreadForm();  
		t1.start();  
	}  
}  