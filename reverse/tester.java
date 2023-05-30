 interface sample1
{
	public abstract void cool();
	public abstract void fo();
}
 class demo1 implements sample1
{
	  public void cool()
	  {
		  System.out.println("hello");
	  }
}
 class tester1 extends demo1
 {
	 public void fo()
	 {
		 System.out.println("hi");
	 }
	 public static void main(String[] args)
	 {
		 tester1 d1=new tester1();
		 d1.fo();
		 d1.cool();
		 
	 }
 }

