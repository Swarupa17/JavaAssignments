import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentResult {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int rno,no,nostudent;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter How many student:");
		nostudent=Integer.parseInt(br.readLine());
		Student s[]=new Student[nostudent];
		for(int i=0;i<nostudent;i++)
		{
			System.out.println("Enter Roll no:");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name Of STudent:");
			name=br.readLine();
			System.out.println("Enter No of subject:");
			no=Integer.parseInt(br.readLine());
			s[i]=new Student(rno,name,no);
			
		}
        for(int i=0;i<nostudent;i++)
        {
        	s[i].calculateMarks();
        }
	}

}
