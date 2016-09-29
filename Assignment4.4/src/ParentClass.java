
public class ParentClass {

	protected String name;
	public ParentClass()
	{
	  System.out.println("Default Constructor");
	}
	public ParentClass(String a)
	{
		this.name=a;
		System.out.println("Parametrized constructor");
	}
}
