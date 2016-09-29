
public class ParentClass {

	protected String name;
	public ParentClass()
	{
	  System.out.println("Default Constructor from parent class");
	}
	public ParentClass(String a)
	{
		this.name=a;
		System.out.println("Parametrized constructor from parent class");
	}
}
