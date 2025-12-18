class Bank 
{

	public static void main(String[] args) 
	{
		Bank_Account acc1 = new Bank_Account();
		acc1.initialize(1234L,"MSd",1000000000.0);
		acc1.display();
		Bank_Account acc2 = new Bank_Account();
		acc2.initialize(3456L,"Virat",10000000.0);
		acc2.display();
	}
}
