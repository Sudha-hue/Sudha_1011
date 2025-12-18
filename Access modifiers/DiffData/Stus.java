package DiffData;
import StuData.Student;
class Stus extends Student 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student ();
		s1.fee = 3000.00;
		System.out.println("fee:"+ s1.fee);
		
		Stus x2 = new Stus();
		x2.dep = "Java";
		System.out.println("dep:"+ x2.dep);
	}
}
