public abstract class FoodRes 
{
	public boolean deliv;
	
	
	
	public abstract void deli();
	public abstract void notDeli();
	
	public String getStatus(){
	  return deliv ? "Deliverd"	: "Not Deliverd";
	}
	
	
}
