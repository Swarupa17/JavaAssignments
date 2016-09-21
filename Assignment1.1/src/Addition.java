
public class Addition {
	public static void main(String args[])
	{
		int num1=10,num2=20;
		while(num2!=0)
		{
			int carry=(num1&num2);
			num1=num1^num2;
			num2=carry<<1;
		}
		System.out.println(num1);
	}

}
