package bookLibrary;

public class Book {
	String bookname;
	 String author;
	protected Book(String b,String c)
	{
		this.bookname=b;
		this.author=c;
	}
	public void display()
	{
		System.out.println("bookname  --->  author name");
		System.out.println(bookname+" --->"+author);	}

}
