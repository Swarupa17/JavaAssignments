import java.util.Scanner;

public class SubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string,sub;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		string = in.nextLine();
		System.out.println("Enter the subString");
		sub=in.nextLine();
		if(string.contains(sub))
		{
			System.out.println("The Substring is found");
		}
		else
		{
			System.out.println("The Substring is not found");
		}
		in.close();
		
	}

}
