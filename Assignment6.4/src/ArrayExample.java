import java.util.Scanner;

public class ArrayExample {
	public static void main(String args [])
	{
	   int first,last,middle,n,search,a[];
	   
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter the elements");
	   n=in.nextInt();
	   a=new int[n];
	   System.out.println("Enter "+n+" integers");
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=in.nextInt();
	   }
	   System.out.println("Enter value to find");
	   search=in.nextInt();
	   first=0;
	   last=n-1;
	   middle=(first+last)/2;
	   while(first<=last)
	   {
		   if (a[middle]< search)
		   {
			   first=middle+1;
		   }
		   else if(a[middle]==search)
		   {
			   System.out.println(search+" found at location "+(middle+1)+".");
			   break;
		   }
		   else
			   last=middle-1;
		   middle=(first+last)/2;
		   
	   }
	   if(first>last)
		   System.out.println(search+"is not present in the lis");
	}

}
