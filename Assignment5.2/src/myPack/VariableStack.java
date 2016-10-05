package myPack;

public class VariableStack implements Stack{
	Stack st;
	public void push(int I)
	{
		 st = null;
		st.push(st, new Integer(I));
	}
	 public int pop()
	 {  Integer I=(Integer) st.pop();
	 System.out.println("Pop---->"+I);
		return I;
		 
	 }
	@Override
	public void push(Stack st, int I) {
		// TODO Auto-generated method stub
		
	}
}
