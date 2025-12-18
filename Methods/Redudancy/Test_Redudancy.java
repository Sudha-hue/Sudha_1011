class Test_Redudancy 
{
	public static void main(String[] args) 
	{
	B_ankAccount acc1 = new B_ankAccount();
	acc1.accNum = 809549L;
	acc1.accName= "YuvaRajSing";
	acc1.balance = 80000000.0;
	System.out.println("accNum\t:"+ acc1.accNum );
	System.out.println("accName\t:"+ acc1.accName );
	System.out.println("balance\t:"+ acc1.balance );
	
	B_ankAccount acc2 = new B_ankAccount();
	acc2.accNum = 53465768L;
	acc2.accName = "Sachin";
	acc2.balance = 900000000.0;
	System.out.println("accNum\t:"+acc2.accNum);
	System.out.println("accName\t:"+acc2.accName);
	System.out.println("balance\t:"+acc2.balance);
	}
}
