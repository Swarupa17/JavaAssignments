import java.util.Scanner;

public class SubstringWithoutFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainstring,substring;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String:");
		mainstring = in.nextLine();
		System.out.println("Enter the subString");
		substring=in.nextLine();
		int i=mainstring.indexOf(mainstring);
		int j=substring.indexOf(substring);
		
		in.close();
	}


}
