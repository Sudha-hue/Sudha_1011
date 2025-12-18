public class pizza extends FoodRes 
{
	
   public void deli(){
    deliv = true;
	System.out.println("pizza is delivered");
   }
    public void notDeli(){
	 deliv = false;
	 System.out.println("pizza is not delivered");
	}
}