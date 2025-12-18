class EmpData 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.e_id = 123;
		e1.emname= "sudha";
		e1.state= "AP";
		e1.salary=35000.0;
		e1.designation= "Java Dev";
		
		e2.e_id = 456;
		e2.emname= "Sukanya";
		e2.state= "AP";
		e2.salary= 30000.0;
		e2.designation= "Analyst";
		System.out.println("Hello World!");
		
		System.out.println("e1 values");
		System.out.println("e1.e_id\t:"+ e1.e_id);
		System.out.println("e1.emname\t:"+e1.emname);
		System.out.println("e1.state\t:"+ e1.state);
		System.out.println("e1.slary\t:"+ e1.salary);
		System.out.println("e1.designation\t:"+ e1.designation);
		
		System.out.println("e2 values");
		System.out.println("e2.e_id\t:"+e2.e_id);
		System.out.println("e2.emname\t:"+e2.emname);
		System.out.println("e2.state\t:"+e2.state);
		System.out.println("e2.slary\t:"+e2.salary);
		System.out.println("e2.designation\t:"+e2.designation);
	}
}
