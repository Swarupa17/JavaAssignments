import java.util.Scanner;

public class ExceptionDemo {
public static void main(String args [])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age=sc.nextInt();
	if(age<0)
	{
		try {
			throw new NegativeAgeException("Age Can Not be Negative");
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	else
		System.out.println("Your age is:"+age);
}
}
