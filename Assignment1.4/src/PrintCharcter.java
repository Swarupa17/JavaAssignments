
public class PrintCharcter {

	public static void main(String[] args) {
		  String ch;
	        int i;
	        System.out.println("Following are the characters corresponding to ASCII codes from 65 to 90 in a tabular format like:");
	        for(i=65; i<=90; i++)
	        {
	            ch = new Character((char)i).toString();
	          
	            System.out.println(i+ " -> " + ch + "\t");
	        }
		

	}

}
