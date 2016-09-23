
public class Test {
	 static {
		print(10);       
	 }    
	 static void print (int x) {   
	 System.out.println (x); 
	 System.exit(0);   
	  } 
}
/* Error: Main method not found in class Test, please define the main method as:
public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application*/