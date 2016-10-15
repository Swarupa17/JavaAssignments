import java.util.Scanner;

public class BankDemoExc {

	public static void main(String arg[]) throws MyException  
    {  
         Scanner in = new Scanner(System.in);  
         Bank b = new Bank();  
           
         System.out.println("\n\n\t----Bank Simulator----");  
         try  
         {  
              while(true)  
              {  
         System.out.println("1.Create Account\t2.Check Balance \n3.Deposit\t\t4.Withdraw\n5.Interest\t\t6.Exit.");  
              int ch = in.nextInt();  
                   switch(ch)  
                   {  
                        case 1:  
                        b.CreateAcc();  
                        break;  
                          
                        case 2:  
                        b.CheckBal();  
                        break;  
                          
                        case 3:  
                        b.Deposit();  
                        break;  
                          
                        case 4:  
                        b.Withdraw();  
                        break;  
                          
                        case 5:  
                        b.Interest();  
                        break;  
                          
                        case 6:  
                        System.exit(0);  
                        break;  
                          
                        default: System.out.println("Invalid Option");  
                   }  
              }  
         }  
         catch(Exception e)  
         {  
              System.out.println("SELF THROWN EXCEPTION IS--->"+e);  
         }  
    }  
}
