interface tester 
{
	void cool();
	void fo();
}
 abstract class sample implements tester
{
	  public void cool()
	  {
		  System.out.println("hello");
	  }
}
 class demo extends sample
 {
	 public void fo()
	 {
		 System.out.println("hi");
	 }
	 public static void main(String[] args)
	 {
		 demo d1=new demo();
		 d1.fo();
		 d1.cool();
		 
	 }
 }

