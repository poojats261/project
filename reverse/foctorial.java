import java.util.Scanner;

 class Factorial {

	static int fact(int no) {
		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		return (fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a integer no");
		int no = sc.nextInt();
		System.out.println(fact(no));
	}
}
