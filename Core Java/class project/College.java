class College 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.rollnumber = 178;
		s1.sname= "Sudha";
		s1.course = "Java";
		s1.fee = 3500.0;
		
		s2.rollnumber = 179;
		s2.sname= "Shoukya";
		s2.course= "Oracle";
		s2.fee = 2000.0;
			
		System.out.println("Hello World!");
		
		System.out.println("s1 values");
		System.out.println("s1.rollnumber\t:"+ s1.rollnumber);
		System.out.println("s1.sname\t:"+s1.sname);
		System.out.println("s1.course\t:"+s1.course);
		System.out.println("s1.fee\t:"+s1.fee);
		
		System.out.println("s2 values");
		System.out.println("s2.rollnumber\t:"+s2.rollnumber);
		System.out.println("s2.sname\t:"+s2.sname);
		System.out.println("s2.course\t:"+s2.course);
		System.out.println("s2.fee\t:"+s2.fee);
		
	}
}
