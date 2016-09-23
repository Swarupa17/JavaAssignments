import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	int rollno;
	String name;
	int number_of_subjects;
	int mark[];

	Student(int roll,String stud_name,int noofsub)throws IOException
	{
	rollno=roll;
	name=stud_name;
	number_of_subjects= noofsub;
	getMarks(noofsub);
	}
	public void getMarks(int nosub ) throws IOException
	{
	mark=new int[nosub];
	BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
	for (int i=0; i<nosub;i++)
	{
	System.out.println("Enter " +i+ " Subject Marks: ");
	mark[i]=Integer.parseInt(br.readLine());
	System.out.println("");
	}

	}
	public void calculateMarks()
	{
	double percentage=0;
	String grade;
	int tmarks=0;
	for (int i=0;i<mark.length;i++)
	{
	tmarks+=mark[i];
	}
	percentage=tmarks/number_of_subjects;
	System.out.println("Roll Number : "+rollno);
	System.out.println("Name Of Student is : "+name);
	System.out.println("Number Of Subject: "+number_of_subjects);
	System.out.println("Percentage Is : "+percentage);

	if (percentage>=70)
	System.out.println("Grade Is First Class With Distinction ");
	else if(percentage>=60 && percentage<70)
	System.out.println("Grade Is First Class");
	else if(percentage>=50 && percentage<60)
	System.out.println("Grade Is Second Class");
	else if(percentage>=40 && percentage<50)
	System.out.println("Grade Is Pass Class");
	else
	System.out.println("You Are Fail");
	}

}
