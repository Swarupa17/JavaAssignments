package myPack;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[])
	{  Stack st =new Stack();
	   FixedStack fd =new FixedStack();
	   VariableStack vs=new VariableStack();
	   fd.push(fd, 23);
	   vs.push(vs,45);
	}

}
