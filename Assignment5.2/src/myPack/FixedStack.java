package myPack;

public class FixedStack implements Stack {
	Stack st;
	public void push(Stack st,int I)
	{
		 st = null;
		st.push(st, new Integer(I));
	}
	 public int pop()
	 {  Integer I=(Integer) st.pop();
	   System.out.println("Pop---->"+I);
		return I;
		 
	 }
}
