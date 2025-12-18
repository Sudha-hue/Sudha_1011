class BankAccount
{
	private String accHName;
	private long accNum;
	private double balance;
	
	void deposit(double amount) {
		System.out.println("\ndeposit() method is called");
		
		balance = balance + amount;
		alert(amount, "credited to");
	}
	void withdraw(double amount){
		System.out.println("\nwithdraw() method is called");
		
		balance = balance - amount;
		alert(amount, "debited from");
	}
	 void currentbalance(){
		 System.out.println(balance);
}
	private void alert(double amount,String action){
		System.out.println("alert() method is called");
		System.out.println (""+amount+"is"+ action + "your acount ");
		System.out.println("Available balance is"+ balance);
	}
	void display(){
		System.out.println("accHName: " +"Sudha" );
		System.out.println("accNum\t: " + 433545351290l);
		System.out.println("balance\t: "+ 1000000);
	}	
		
}

