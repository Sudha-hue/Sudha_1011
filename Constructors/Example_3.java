class Example_3 
{
	int y;
	Example_3(){
	  System.out.println("npc:"+y);
	}
	  Example_3(int y){
		  
		  System.out.println("pc:"+y);
	}
	 void m1(){
	   System.out.println("m1:"+ y);
	 }
	   void m2(int a){
		System.out.println("m2:"+a);   
	    m1();
	   }
	public static void main(String[] args) 
	{
		Example_3 e1 = new Example_3();
		e1.m2(12);
		e1.m1();
		
		
		Example_3 e2 = new Example_3(6);
		e2.m2(12);
		System.out.println("Hello World!");
	}
}
