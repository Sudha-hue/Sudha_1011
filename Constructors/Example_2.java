class Example_2 
{
	private int x;
	private int y;
	
	Example_2(int x,int y){
		System.out.println("param Constructor");
		this.x = x;
		this.y=y;
	}
		
	public static void main(String[] args) 
	{
	   Example_2 e1 = new Example_2(10,25);
	   
	   Example_2 e2 = new Example_2(30,45);
	   
	   System.out.println(e1.x+" , "+e1.y);
	   System.out.println(e2.x+" , "+e2.y);
	   
	}
}
