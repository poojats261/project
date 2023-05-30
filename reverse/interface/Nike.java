abstract interface nike
{
	public abstract void shoes();
}
interface puma extends nike
{
	public abstract void bags();
}
 public class rajoutlet implements puma
{
	public void shoes()
	{
		System.out.println("karthikamasa shoes...");
	}
	public void bags()
	{
		System.out.println("super bags...");
	}
	public static void main(String[] args)
	{
		rajoutlet r1=new rajoutlet();
		r1.shoes();
		r1.bags();

	}
	

}
