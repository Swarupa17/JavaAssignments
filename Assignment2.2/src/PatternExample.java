import java.util.Scanner;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner reader=new Scanner(System.in);
       System.out.println("Enter a number:");
       int n=reader.nextInt();
     for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   if(i==j||j==(n-i-1))
    		   {
    			   System.out.print("*");
    		   }
    		   else
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println(" ");
       }
       
      
	}

}
