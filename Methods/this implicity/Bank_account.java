class Bank_Account 
{
	private long accNum;
	private String accName;
	private double balance;
	
 void initialize(long accNum,String accName,double balance){
	 this.accNum = accNum;
	 this.accName = accName;
	 this.balance = balance;
 }
 void display(){
	 System.out.println("accNum\t:"+accNum);
	 System.out.println("accName\t:"+accName);
	 System.out.println("balance\t:"+balance);
 }
}
	
