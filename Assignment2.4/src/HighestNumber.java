import java.util.Scanner;

public class HighestNumber {
public static void main(String args [])
{
	int a,b,c;
	System.out.println("Enter the three number");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>=b&&a>=c)
	
		System.out.println("The highest number is "+a);
	
	if(b>=a && b>=c)
		System.out.println("The highest number is "+b);
	if(c>=a && c>=b)
		System.out.println("The highest number is "+c);
}
}
