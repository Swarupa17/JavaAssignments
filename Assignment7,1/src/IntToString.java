import java.util.Scanner;

public class IntToString {
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the number which are conver to String:");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		String intStr = String.valueOf(num);
		System.out.println("Num: "+intStr);
		
	}

}
