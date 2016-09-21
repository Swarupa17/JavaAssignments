
public class Swapping {
	public static void main(String args[])
	{
		int a=10,b=20;
		System.out.println("Before Swap");
		System.out.println("The Value of A=" +a );
		System.out.println("The Value of B=" +b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap");
		System.out.println("The Value of A=" +a );
		System.out.println("The Value of B=" +b );
		
	}

}
