package Test;

import bookLibrary.Book;

public class ProtectedDemo extends Book{
	
	protected ProtectedDemo(String b, String c) {
		super(b, c);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		ProtectedDemo bk=new ProtectedDemo("Let us Java", "Yashwant Kanetkar");
		bk.display();
	}

}
